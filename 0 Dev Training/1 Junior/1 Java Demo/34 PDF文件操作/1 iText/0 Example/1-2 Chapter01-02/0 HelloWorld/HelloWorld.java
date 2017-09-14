/**
 * 测试iText 对PDF 的处理能力
 */

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
/**
 * @author Administrator
 *
 */
public class HelloWorld {

	public static void main( String[] args ) 
	{
		System.out.println("Chapter 1: example HelloWorld");
		System.out.println("-> Creates a PDF file with the text 'Hello World';");
		System.out.println("   Default values are used for PageSize and margins.");
		System.out.println("-> jars needed: iText.jar");
		System.out.println("-> files generated in /results subdirectory:");
		System.out.println("   HelloWorld.pdf");
		// step 1: creation of a document-object
		Document document = new Document();
		try {
			// step 2:
			// we create a writer
			PdfWriter.getInstance(
					// that listens to the document
					document,
					// and directs a PDF-stream to a file
					new FileOutputStream("c:\\HelloWorld.pdf"));
			// step 3: we open the document
			document.open();
			// step 4: we add a paragraph to the document
			document.add(new Paragraph("Hello World"));
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}

		// step 5: we close the document
		document.close();
		return;
	}
}
