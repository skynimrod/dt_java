package com.channelsoft.signature.web.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.HTMLWriter;
import org.dom4j.io.SAXReader;

import com.channelsoft.mms.domain.MmContent.ReadParamException;

public class SmilHelper {


	/**
	 * 根据文本文件、图片文件、声音文件地址创建smil文件
	 * @param fileNameList
	 * @throws DocumentException 
	 * @throws IOException 
	 */
	public static String writeSmilXml(List<String> fileNameList){
		
		try {
			SAXReader reader = new SAXReader(); 
			Document doc = reader.read(SystemEnvUtil.getConfigPath("mm7/module.smil"));
			List layoutNodes = doc.selectNodes("//root-layout");
			if(layoutNodes==null || layoutNodes.size()<=0){
				return null;
			}
			Element layoutEle = (Element)layoutNodes.get(0);
			
			List parNodes = doc.selectNodes("//par");
			if(parNodes==null || parNodes.size()<=0){
				return null;
			}
			Element parEle = (Element)parNodes.get(0);
			
			int height = 0;
			int time = 0;         //时间按ms计算
			for(String fileName:fileNameList){
				if(fileName!=null && !fileName.trim().equals("")){
					File file = new File(fileName);
					if(file.isFile()){
						if(fileName.toLowerCase().endsWith(".txt")){
							Element regionEle = layoutEle.addElement("region");
							regionEle.addAttribute("id", "Text");
							regionEle.addAttribute("width", 230+"");
							regionEle.addAttribute("height", 120+"");
							regionEle.addAttribute("top", height + 10 +"");
							regionEle.addAttribute("left", 5+"");
							regionEle.addAttribute("fit", "scroll");
							height += 120; 
							time += 3000;
							Element txtEle = parEle.addElement("text");
							txtEle.addAttribute("region", "Text").addAttribute("src", fileName);
						}else if(fileName.toLowerCase().endsWith(".jpg") 
								|| fileName.toLowerCase().endsWith(".gif")
								|| fileName.toLowerCase().endsWith(".jpeg")
								|| fileName.toLowerCase().endsWith(".png")){
							Element regionEle = layoutEle.addElement("region");
							regionEle.addAttribute("id", "Image");
							regionEle.addAttribute("width", 230+"");
							regionEle.addAttribute("height", 200+"");
							regionEle.addAttribute("top", height + 10+"");
							regionEle.addAttribute("left", 5+"");
							regionEle.addAttribute("fit", "meet");
							height += 200;
							time += 3000;
							Element imgEle = parEle.addElement("image");
							imgEle.addAttribute("region", "Image").addAttribute("src", fileName);
						}else if(fileName.toLowerCase().endsWith(".amr") 
								|| fileName.toLowerCase().endsWith(".mid")){
							height += 100;
							time += 20000;
							parEle.addElement("audio").addAttribute("src", fileName);
						}
					}
				}
			}
			
			layoutEle.addAttribute("height", height + "");
			parEle.addAttribute("dur", time + "ms");
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();

			HTMLWriter writer = new HTMLWriter(out);
			writer.write(doc); 
			writer.close();
			return out.toString("UTF8");
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	/**
	 * 解析String型smil文件
	 * 
	 * @param byteFile
	 * @return
	 * @throws DocumentException 
	 * @throws DocumentException
	 * @throws UnsupportedEncodingException 
	 * @throws IOException
	 * @throws ReadParamException
	 */
	public static List<String> parseSmilFile(String smilFile) throws DocumentException, UnsupportedEncodingException {
		List<String> fileList = new ArrayList<String>();
		
		List nodes = new ArrayList();
		InputStream in = new ByteArrayInputStream(smilFile.getBytes("utf8"));
		
		SAXReader reader = new SAXReader(); 
		Document doc = reader.read(in);
		Element root = doc.getRootElement();
		List<Element> textElement = doc.selectNodes("//text/@src");
		List<Element> imageElement = doc.selectNodes("//image/@src");
		List<Element> audioEleList = doc.selectNodes("//audio/@src");
		nodes.addAll(textElement);
		nodes.addAll(imageElement);
		nodes.addAll(audioEleList);
		if(nodes!=null && nodes.size()>0){
			for(Object o:nodes){
				String filePath = ((Attribute)o).getValue();
				filePath = filePath.trim();				
				fileList.add(filePath);
			}
		}
		
		return fileList;
	}

	/**
	 * 从文本文件中读入内容
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static String readTxtFile(String file, String encoding) throws IOException{
		String result = "";
		if(encoding==null){
			encoding = "utf-8";
		}
		FileInputStream fio = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fio, encoding));
		String s = "";
		while((s = br.readLine())!=null) {
		      result += s;    
		    };
		fio.close();
		return result;
	}
	

    /**
     * 写一个byte[]到文件中
     * @param b
     * @param outputFile
     * @return
     */
	public static File writeFileFromBytes(byte[] b, String outputFile) {
        BufferedOutputStream stream = null;
		FileOutputStream fstream = null;
        File file = null;
        try {
            file = new File(outputFile);
            fstream = new FileOutputStream(file);
            stream = new BufferedOutputStream(fstream);
            stream.write(b);
            stream.flush();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fstream != null) {
                try {
                	fstream.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return file;
    }
	
	public static void main(String[] args){
//		ISignatureService signatureService = new SignatureService();
//		Signature signature = signatureService.getSignatureById("1");
//		String smilFile = signature.getMmsContent();
//		try {
//			List<String> fileList = SmilHelper.parseSmilFile(smilFile);
//			System.out.println(fileList.size());
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String filePath = "E:\\tempFile\\31232614227953.txt";
		try {
			String c = SmilHelper.readTxtFile(filePath, null);
			System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

