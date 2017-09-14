package chapter02;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * This example was written by Bruno Lowagie. It is part of the book 'iText in
 * Action' by Manning Publications. 
 * ISBN: 1932394796
 * http://www.1t3xt.com/docs/book.php 
 * http://www.manning.com/lowagie/
 */

public class HelloWorldWriter {

	/**
	 * Generates a PDF file, then 'folds' it.
	 * 
	 * @param args
	 *            no arguments needed here
	 */
	public static void main(String[] args) {
		System.out.println("Chapter 2: example HelloWorldWriter");
		System.out.println("-> Creates a PDF file, then 'folds' it;");
		System.out.println("   4 pages are copied on 1 in a specific order.");
		System.out.println("-> jars needed: iText.jar");
		System.out.println("-> files generated in /results subdirectory:");
		System.out.println("   HelloWorldToImport.pdf");
		System.out.println("   HelloWorldFolded.pdf");
		// we create a PDF file
		createPdf("c:/HelloWorldToImport.pdf");
		// step 1
		Document document = new Document(PageSize.A4);
		try {
			// we create a PdfReader object
			PdfReader reader = new PdfReader("c:/HelloWorldToImport.pdf");
			// step 2
			PdfWriter writer = PdfWriter.getInstance(document,
					new FileOutputStream("c:/HelloWorldFolded.pdf"));
			// step 3
			document.open();
			// step 4
			PdfContentByte cb = writer.getDirectContent();
			PdfImportedPage page;
			page = writer.getImportedPage(reader, 1);
			cb.addTemplate(page, -0.5f, 0f, 0f, -0.5f, PageSize.A4.getWidth() / 2,
					PageSize.A4.getHeight());
			page = writer.getImportedPage(reader, 2);
			cb.addTemplate(page, 0.5f, 0f, 0f, 0.5f, 0f, 0f);
			page = writer.getImportedPage(reader, 3);
			cb.addTemplate(page, 0.5f, 0f, 0f, 0.5f, PageSize.A4.getWidth() / 2f,
					0f);
			page = writer.getImportedPage(reader, 4);
			cb.addTemplate(page, -0.5f, 0f, 0f, -0.5f, PageSize.A4.getWidth(),
					PageSize.A4.getHeight());
			cb.setLineDash(20, 10, 10);
			cb.moveTo(0, PageSize.A4.getHeight() / 2f);
			cb.lineTo(PageSize.A4.getWidth(), PageSize.A4.getHeight() / 2f);
			cb.stroke();
			cb.moveTo(PageSize.A4.getWidth() / 2f, 0);
			cb.lineTo(PageSize.A4.getWidth() / 2f, PageSize.A4.getHeight());
			cb.stroke();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		// step 5
		document.close();
	}

	/**
	 * Generates a PDF file with bookmarks.
	 * 
	 * @param filename
	 *            the filename of the PDF file.
	 */
	private static void createPdf(String filename) {
		// we create a document with multiple pages and bookmarks
		Document document = new Document(PageSize.A4);
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filename));
			document.open();
			document
					.add(new Paragraph(
							"In this document, we are going to say hello to different beings in different languages."));
			document.newPage();
			Paragraph hello = new Paragraph("(English:) hello, " +
					"(Esperanto:) he, alo, saluton, (Latin:) heu, ave, " +
					"(French:) all\u00f4, (Italian:) ciao, (German:) hallo, he, heda, holla, " +
					"(Portuguese:) al\u00f4, ol\u00e1, hei, psiu, bom d\u00eda, (Dutch:) hallo, dag, " +
					"(Spanish:) ola, eh, (Catalan:) au, bah, eh, ep, " +
					"(Swedish:) hej, hejsan(Danish:) hallo, dav, davs, goddag, hej, " +
					"(Norwegian:) hei; morn, (Papiamento:) halo; hallo; k\u00ed tal, " +
					"(Faeroese:) hall\u00f3, hoyr, (Turkish:) alo, merhaba, (Albanian:) tungjatjeta");
			Chapter universe = new Chapter("To the Universe:", 1);
			Section section;
			section = universe.addSection("to the World:");
			section.add(hello);
			section = universe.addSection("to the Sun:");
			section.add(hello);
			section = universe.addSection("to the Moon:");
			section.add(hello);
			section = universe.addSection("to the Stars:");
			section.add(hello);
			document.add(universe);
			Chapter people = new Chapter("To the People:", 2);
			section = people.addSection("to mothers and fathers:");
			section.add(hello);
			section = people.addSection("to brothers and sisters:");
			section.add(hello);
			section = people.addSection("to wives and husbands:");
			section.add(hello);
			section = people.addSection("to sons and daughters:");
			section.add(hello);
			section = people.addSection("to complete strangers:");
			section.add(hello);
			document.add(people);
			Chapter animals = new Chapter("To the Animals:", 3);
			section = animals.addSection("to cats and dogs:");
			section.add(hello);
			section = animals.addSection("to birds and bees:");
			section.add(hello);
			section = animals.addSection("to farm animals and wild animals:");
			section.add(hello);
			section = animals.addSection("to bugs and beatles:");
			section.add(hello);
			section = animals.addSection("to fish and shellfish:");
			section.add(hello);
			document.add(animals);
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		document.close();
	}
}