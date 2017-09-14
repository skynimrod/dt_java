import java.lang.*;
import java.net.*;      // 包含 URL  等类的定义
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
        // 构建Workbook 对象， 只读Workbook 对象
        
        // 直接从本地文件创建 Workbook
        
        // 从输入流创建 Workbook
        
        InputStream is = new FileInputStream( "./1.xls" );
        Workbook rwb = Workbook.getWorkbook( is );
        
        int sheets = rwb.getNumberOfSheets();
        
        System.out.println("总共有"+sheets+"表！");
        
        // 获取第一张Sheet 表 可能通过Sheet的名称来访问它，也可以通过下标来访问它。
        // 如果通过下标来访问的话，要注意的一点是下标从0开始，就像数组一样。
        Sheet  rs = rwb.getSheet(0);
      
        //获取第一行，第一列的值 (0,0)
        Cell c00 = rs.getCell(0, 0);
        String strc00 = c00.getContents();

//获取第一行，第二列的值(1,0)    第一个参数是列，第2个参数是行
Cell c10 = rs.getCell(1, 0);
String strc10 = c10.getContents();

//获取第二行，第二列的值
Cell c11 = rs.getCell(1, 1);
String strc11 = c11.getContents();

System.out.println("Cell(0, 0)" + " value : " + strc00 + "; type : " + c00.getType());
System.out.println("Cell(1, 0)" + " value : " + strc10 + "; type : " + c10.getType());
System.out.println("Cell(1, 1)" + " value : " + strc11 + "; type : " + c11.getType());
 
 //操作完成时，关闭对象，释放占用的内存空间
rwb.close();

// =================创建新的 工作表 =========
//构建Workbook对象, 只读Workbook对象
//Method 1：创建可写入的Excel工作薄
jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(new File("./3.xls"));

//Method 2：将WritableWorkbook直接写入到输出流
/*
OutputStream os = new FileOutputStream(targetfile);
jxl.write.WritableWorkbook wwb = Workbook.createWorkbook(os);
*/

          // 创建Excel 工作表
          jxl.write.WritableSheet ws = wwb.createSheet("地产类",0);
          
          // 1. 添加 Label 对象
          jxl.write.Label labelC = new jxl.write.Label(0,0,"北辰股份");
          ws.addCell( labelC );
          
          // 添加带有字体Formatting 的对象
          jxl.write.WritableFont wf = new jxl.write.WritableFont( jxl.write.WritableFont.TIMES, 18, jxl.write.WritableFont.BOLD, true );
          jxl.write.WritableCellFormat wcfF = new jxl.write.WritableCellFormat(wf );
          jxl.write.Label labelCF = new jxl.write.Label(1, 0, "601588", wcfF);
          ws.addCell(labelCF);
          
          // 添加 带有字体颜色的Formatting 的对象
          jxl.write.WritableFont wfc = new jxl.write.WritableFont(jxl.write.WritableFont.ARIAL, 10, jxl.write.WritableFont.NO_BOLD, false,
                  jxl.format.UnderlineStyle.NO_UNDERLINE,  jxl.format.Colour.RED );
          jxl.write.WritableCellFormat  wcfFC = new jxl.write.WritableCellFormat( wfc );
                    //设置背景色
          wcfFC.setBackground(jxl.format.Colour.RED);

          jxl.write.Label labelCFC = new jxl.write.Label(2,0, "5.8", wcfFC );
          ws.addCell(labelCFC );
          
          // 2. 添加 Number  对象
          jxl.write.Number labelN = new jxl.write.Number(0, 1, 3.1415926 );
          ws.addCell( labelN);
          
          // 添加带有 formatting  的Number  对象
          jxl.write.NumberFormat nf = new jxl.write.NumberFormat("#.##");
          jxl.write.WritableCellFormat wcfN = new jxl.write.WritableCellFormat( nf );
          jxl.write.Number labelNF = new jxl.write.Number( 1,1, 3.1415926, wcfN );
          ws.addCell( labelNF);

          // 3. 添加 Boolean 对象
          jxl.write.Boolean labelB = new jxl.write.Boolean(0, 2, false );
          ws.addCell( labelB );
          
          // 4. 添加 DateTime 对象
          jxl.write.DateTime labelDT = new jxl.write.DateTime(0, 3, new java.util.Date() );
          ws.addCell( labelDT );
          
          //添加带有 formatting 的DateFormat 对象
          jxl.write.DateFormat df = new jxl.write.DateFormat("yyyy-mm-dd hh:mm:ss");
          jxl.write.WritableCellFormat wcfDF = new jxl.write.WritableCellFormat( df );
          
          
          //设置背景色
          wcfDF.setBackground(jxl.format.Colour.GREEN);

          //设置边框及边框颜色
          //wcfDF.setBorder(Border.ALL, BorderLineStyle.THIN,jxl.format.Colour.GRAY_25);
  
          jxl.write.DateTime labelDTF = new jxl.write.DateTime(1,3, new java.util.Date(), wcfDF );
          ws.addCell( labelDTF);
          
          
          // 5. 添加公式  。。。。。。例如:  SUM(D1:Q1), 需要注意的是公式都用大写，不然会出错
          jxl.write.Formula fl = new jxl.write.Formula(0,5, "A2+B2") ;
          ws.addCell( fl );
          jxl.write.Formula fl2 = new jxl.write.Formula(1,5, "SUM(A2:B2)") ;
          ws.addCell( fl2 );
          
          // 6. 添加超链接
          WritableHyperlink wrlink = new WritableHyperlink( 0, 6,0, 6, new URL("http://news.sina.com.cn"), "emlog");
          ws.addHyperlink( wrlink );
          
          // 7. 添加图像
          jxl.write.WritableImage wrimage = new jxl.write.WritableImage( 1, 5, 10, 10, new File("./cross.png") );
          ws.addImage( wrimage );
          
          // 注意:   API 中注明 只支持 pnp 文件, 然而用其他格式的图片, 通过将其后缀改为pnp 也能放到excel 文件中. 
          
          
          // 写入 Excel 工作表
          wwb.write();
          
          // 关闭Excel 工作薄对象
          wwb.close();
          
          // 3. 拷贝、更新Excel 工作薄
          // 就是打开一个现有的工作薄，然后再打开一个目标创建的Excel  工作薄, 然后挨个将Cell内容拷贝过去, 这儿的示例只拷贝内容，格式忽略了
          
          // 创建只读的Excel 工作薄的对象
          jxl.Workbook rw = jxl.Workbook.getWorkbook( new File("4.xls"));
          
          // 创建可写入的Excel 工作薄对象
          jxl.write.WritableWorkbook wb = Workbook.createWorkbook( new File("4_1.xls"), rw );
          
          
          // 读取第一张工作表
          jxl.write.WritableSheet ws1= wb.getSheet(0);
          
          // 获得第一个单元格对象  , 相当于修改原有的CELL 
          jxl.write.WritableCell wc = ws1.getWritableCell( 0, 0 );
          
          // 判断单元格的类型，做出相应的转化
          if ( wc.getType() == CellType.LABEL ) {
            jxl.write.Label   l = (jxl.write.Label) wc ;
            l.setString("The value has been modified");
          }
          
          // 写入Excel对象
          wb.write();
          
          // 关闭可写入的 Excel 对象
          wb.close();
          
          // 关闭只读的Excel 对象
          rw.close();
        } 
      catch( Exception e ) {
        
        e.printStackTrace();
      }
      return;
  }
}