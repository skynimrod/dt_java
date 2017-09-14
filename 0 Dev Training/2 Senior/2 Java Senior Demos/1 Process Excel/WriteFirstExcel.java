import java.lang.*;
import java.net.*;      // ���� URL  ����Ķ���
import java.io.*;
import jxl.*;
import jxl.write.*;
import javax.swing.*;

public class WriteFirstExcel
{
  public static void main( String[] args )
  {
    /*
      JFrame frame = new JFrame("Hello World X!");
    
      JLabel label = new JLabel("Hello Java!", JLabel.CENTER );
    
      frame.getContentPane().add(label);
    
      frame.setSize(300, 300);
      frame.setVisible(true);
    */
    
      try {
        // ����Workbook ���� ֻ��Workbook ����
        
        // ֱ�Ӵӱ����ļ����� Workbook
        
        // ������������ Workbook
        
        InputStream is = new FileInputStream( "./1.xls" );
        Workbook rwb = Workbook.getWorkbook( is );
        
        int sheets = rwb.getNumberOfSheets();
        
        System.out.println("�ܹ���"+sheets+"��");
        
        // ��ȡ��һ��Sheet �� ����ͨ��Sheet����������������Ҳ����ͨ���±�����������
        // ���ͨ���±������ʵĻ���Ҫע���һ�����±��0��ʼ����������һ����
        Sheet  rs = rwb.getSheet(0);
      
        //��ȡ��һ�У���һ�е�ֵ (0,0)
        Cell c00 = rs.getCell(0, 0);
        String strc00 = c00.getContents();

//��ȡ��һ�У��ڶ��е�ֵ(1,0)    ��һ���������У���2����������
Cell c10 = rs.getCell(1, 0);
String strc10 = c10.getContents();

//��ȡ�ڶ��У��ڶ��е�ֵ
Cell c11 = rs.getCell(1, 1);
String strc11 = c11.getContents();

System.out.println("Cell(0, 0)" + " value : " + strc00 + "; type : " + c00.getType());
System.out.println("Cell(1, 0)" + " value : " + strc10 + "; type : " + c10.getType());
System.out.println("Cell(1, 1)" + " value : " + strc11 + "; type : " + c11.getType());
 
 //�������ʱ���رն����ͷ�ռ�õ��ڴ�ռ�
rwb.close();

// =================�����µ� ������ =========
//����Workbook����, ֻ��Workbook����
//Method 1��������д���Excel������
jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(new File("./3.xls"));

//Method 2����WritableWorkbookֱ��д�뵽�����
/*
OutputStream os = new FileOutputStream(targetfile);
jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(os);
*/

          // ����Excel ������
          jxl.write.WritableSheet ws = wwb.createSheet("�ز���",0);
          
          // 1. ��� Label ����
          jxl.write.Label labelC = new jxl.write.Label(0,0,"�����ɷ�");
          ws.addCell( labelC );
          
          // ��Ӵ�������Formatting �Ķ���
          jxl.write.WritableFont wf = new jxl.write.WritableFont( jxl.write.WritableFont.TIMES, 18, jxl.write.WritableFont.BOLD, true );
          jxl.write.WritableCellFormat wcfF = new jxl.write.WritableCellFormat(wf );
          jxl.write.Label labelCF = new jxl.write.Label(1, 0, "601588", wcfF);
          ws.addCell(labelCF);
          
          // ��� ����������ɫ��Formatting �Ķ���
          jxl.write.WritableFont wfc = new jxl.write.WritableFont(jxl.write.WritableFont.ARIAL, 10, jxl.write.WritableFont.NO_BOLD, false,
                  jxl.format.UnderlineStyle.NO_UNDERLINE,  jxl.format.Colour.RED );
          jxl.write.WritableCellFormat  wcfFC = new jxl.write.WritableCellFormat( wfc );
                    //���ñ���ɫ
          wcfFC.setBackground(jxl.format.Colour.RED);

          jxl.write.Label labelCFC = new jxl.write.Label(2,0, "5.8", wcfFC );
          ws.addCell(labelCFC );
          
          // 2. ��� Number  ����
          jxl.write.Number labelN = new jxl.write.Number(0, 1, 3.1415926 );
          ws.addCell( labelN);
          
          // ��Ӵ��� formatting  ��Number  ����
          jxl.write.NumberFormat nf = new jxl.write.NumberFormat("#.##");
          jxl.write.WritableCellFormat wcfN = new jxl.write.WritableCellFormat( nf );
          jxl.write.Number labelNF = new jxl.write.Number( 1,1, 3.1415926, wcfN );
          ws.addCell( labelNF);

          // 3. ��� Boolean ����
          jxl.write.Boolean labelB = new jxl.write.Boolean(0, 2, false );
          ws.addCell( labelB );
          
          // 4. ��� DateTime ����
          jxl.write.DateTime labelDT = new jxl.write.DateTime(0, 3, new java.util.Date() );
          ws.addCell( labelDT );
          
          //��Ӵ��� formatting ��DateFormat ����
          jxl.write.DateFormat df = new jxl.write.DateFormat("yyyy-mm-dd hh:mm:ss");
          jxl.write.WritableCellFormat wcfDF = new jxl.write.WritableCellFormat( df );
          
          
          //���ñ���ɫ
          wcfDF.setBackground(jxl.format.Colour.GREEN);

          //���ñ߿򼰱߿���ɫ
          //wcfDF.setBorder(Border.ALL, BorderLineStyle.THIN,jxl.format.Colour.GRAY_25);
  
          jxl.write.DateTime labelDTF = new jxl.write.DateTime(1,3, new java.util.Date(), wcfDF );
          ws.addCell( labelDTF);
          
          
          // 5. ��ӹ�ʽ  ����������������:  SUM(D1:Q1), ��Ҫע����ǹ�ʽ���ô�д����Ȼ�����
          jxl.write.Formula fl = new jxl.write.Formula(0,5, "A2+B2") ;
          ws.addCell( fl );
          jxl.write.Formula fl2 = new jxl.write.Formula(1,5, "SUM(A2:B2)") ;
          ws.addCell( fl2 );
          
          // 6. ��ӳ�����
          WritableHyperlink wrlink = new WritableHyperlink( 0, 6,0, 6, new URL("http://news.sina.com.cn"), "emlog");
          ws.addHyperlink( wrlink );
          
          // 7. ���ͼ��
          jxl.write.WritableImage wrimage = new jxl.write.WritableImage( 1, 5, 10, 10, new File("./cross.png") );
          ws.addImage( wrimage );
          
          // ע��:   API ��ע�� ֻ֧�� pnp �ļ�, Ȼ����������ʽ��ͼƬ, ͨ�������׺��Ϊpnp Ҳ�ܷŵ�excel �ļ���. 
          
          
          // д�� Excel ������
          wwb.write();
          
          // �ر�Excel ����������
          wwb.close();
          
          // 3. ����������Excel ������
          // ���Ǵ�һ�����еĹ�������Ȼ���ٴ�һ��Ŀ�괴����Excel  ������, Ȼ�󰤸���Cell���ݿ�����ȥ, �����ʾ��ֻ�������ݣ���ʽ������
          
          // ����ֻ����Excel �������Ķ���
          jxl.Workbook rw = jxl.Workbook.getWorkbook( new File("4.xls"));
          
          // ������д���Excel ����������
          jxl.write.WritableWorkbook wb = Workbook.createWorkbook( new File("4_1.xls"), rw );
          
          
          // ��ȡ��һ�Ź�����
          jxl.write.WritableSheet ws1= wb.getSheet(0);
          
          // ��õ�һ����Ԫ�����  , �൱���޸�ԭ�е�CELL 
          jxl.write.WritableCell wc = ws1.getWritableCell( 0, 0 );
          
          // �жϵ�Ԫ������ͣ�������Ӧ��ת��
          if ( wc.getType() == CellType.LABEL ) {
            jxl.write.Label   l = (jxl.write.Label) wc ;
            l.setString("The value has been modified");
          }
          
          // д��Excel����
          wb.write();
          
          // �رտ�д��� Excel ����
          wb.close();
          
          // �ر�ֻ����Excel ����
          rw.close();
        } 
      catch( Exception e ) {
        
        e.printStackTrace();
      }
      return;
  }
}