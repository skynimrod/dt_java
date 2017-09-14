// �����ļ�ͷ
//     CreateSVGHeader(FileName, Version, CSS, Charset, etc)

// ���� Label 
//     CreateLabel(Name, Title, Position, Charset, CSS)

// ����Combobox
//     CreateCombobox(Name, Content, CSS)

// ���� Button
//     CreateButton(Name, Title, CSS )

// ���¼�
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

        //����XML�ĵ���Ԫ��
        Element rootElement = document.addElement( "DOM4J����XML�ĵ�" );

        rootElement.addComment( "����ˮ��2007-4-24���ϴ���" );
        Element nameElement = rootElement.addElement( "����ˮ��" );
        nameElement.addAttribute( "����", "��������" );
  	Element schoolElement = nameElement.addElement( "ѧУ" );
  	schoolElement.setText( "��������ѧԺ" );
  	Element cityElement = rootElement.addElement( "����" );
  	cityElement.setText( "�Ϻ�" );
  	Element homeElement = cityElement.addElement( "סַ" );
  	homeElement.setText( "��һ�" );
  

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
  
        //����һ��XML�ĵ�
        Document docement=DocumentHelper.createDocument();
  
        //����XML�ĵ���Ԫ��
        Element rootElement=docement.addElement("DOM4J����XML�ĵ�");
        rootElement.addComment("����ˮ��2007-4-24���ϴ���");
        Element nameElement=rootElement.addElement("����ˮ��");
        nameElement.addAttribute("����","��������");
  	Element schoolElement=nameElement.addElement("ѧУ");
  	schoolElement.setText("��������ѧԺ");
  	Element cityElement=rootElement.addElement("����");
  	cityElement.setText("�Ϻ�");
  	Element homeElement=cityElement.addElement("סַ");
  	homeElement.setText("��һ�");
  
	
      	
  	//����XML�ĵ�, ��Ҫע����� OutputFormat �� XMLWriter ��Ҫ��import ��ָ�� org.dom4j.io.*, ��Ȼ��ֱ����JDK��ȱʡ��������������.
  	try {
            	// ��ʽ�����,����IE���һ�� 
   		OutputFormat format = OutputFormat.createPrettyPrint();
   
   		// ָ��XML���� 
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
