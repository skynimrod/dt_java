// 创建文件头
//     CreateSVGHeader(FileName, Version, CSS, Charset, etc)

// 创建 Label 
//     CreateLabel(Name, Title, Position, Charset, CSS)

// 创建Combobox
//     CreateCombobox(Name, Content, CSS)

// 创建 Button
//     CreateButton(Name, Title, CSS )

// 绑定事件
//     BindEvent(Name, )

import java.io.*;

import org.dom4j.*;
import org.dom4j.io.*;
import java.util.*;

public class Java4XML {

    public static void CreateSVGHeader( String filename, String encoding ){
         Document document = DocumentHelper.createDocument();

      	/*
        Element root = document.addElement( "root" );

        Element author1 = root
                               .addElement( "author" )
                               .addAttribute( "name", "James" )
                               .addAttribute( "location", "UK" )
                               .addText( "James Strachan" );
	*/

        //设置XML文档的元素
        Element rootElement = document.addElement( "DOM4J创建XML文档" );

        rootElement.addComment( "镜花水月2007-4-24晚上创建" );
        Element nameElement = rootElement.addElement( "镜花水月" );
        nameElement.addAttribute( "名字", "不告诉你" );
  	Element schoolElement = nameElement.addElement( "学校" );
  	schoolElement.setText( "西安翻译学院" );
  	Element cityElement = rootElement.addElement( "城市" );
  	cityElement.setText( "上海" );
  	Element homeElement = cityElement.addElement( "住址" );
  	homeElement.setText( "徐家汇" );
  

  	try {
        	System.out.println("\n-------\n");
		System.out.println( document.asXML() );

		File file = new File( filename );
             	FileWriter out = new FileWriter( file );
             	document.write( out );

/*		
		fileWriter = new FileWriter(filename,isReWrite);
		bufferWriter = new BufferedWriter(fileWriter);
		printWriter = new PrintWriter(bufferWriter); 
		printWriter.println(new String(valueMap.toString().getBytes(),"UTF-8")); 

*/

        } catch (IOException e) {
             	e.printStackTrace();
        }
     }

    //public void CreateLabel();

    //public void CreateComboBox();

    //public void CreateButton();

    //
    //  Create a new XML
    //
    public static boolean newXML(String fileName){
  
        boolean returnValue=false;
  
        //定义一个XML文档
        Document docement=DocumentHelper.createDocument();
  
        //设置XML文档的元素
        Element rootElement=docement.addElement("DOM4J创建XML文档");
        rootElement.addComment("镜花水月2007-4-24晚上创建");
        Element nameElement=rootElement.addElement("镜花水月");
        nameElement.addAttribute("名字","不告诉你");
  	Element schoolElement=nameElement.addElement("学校");
  	schoolElement.setText("西安翻译学院");
  	Element cityElement=rootElement.addElement("城市");
  	cityElement.setText("上海");
  	Element homeElement=cityElement.addElement("住址");
  	homeElement.setText("徐家汇");
  
	
      	
  	//创建XML文档, 需要注意的是 OutputFormat 与 XMLWriter 需要在import 中指定 org.dom4j.io.*, 不然会直接用JDK的缺省方法，编译会出错.
  	try {
            	// 格式化输出,类型IE浏览一样 
   		OutputFormat format = OutputFormat.createPrettyPrint();
   
   		// 指定XML编码 
   		format.setEncoding( "GBK" );
   
   		XMLWriter writer=new XMLWriter( new FileWriter( new File( fileName ) ), format ); 
          	writer.write( docement );
   		writer.close();
   
   		return returnValue=true;   
  	} catch (IOException e) {
   		e.printStackTrace();
  	}

    
  	return returnValue;
   }    

   public static void main( String args[] ) {
	CreateSVGHeader( ".\\Hello.xml", "utf-8");
	boolean returnValue=newXML(".\\Test.xml");
   }
     
   

}
