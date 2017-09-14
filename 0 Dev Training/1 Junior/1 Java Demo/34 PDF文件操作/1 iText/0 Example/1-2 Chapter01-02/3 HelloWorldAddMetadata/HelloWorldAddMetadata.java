/* in_action/chapter02/HelloWorldAddMetadata.java */

//package in_action.chapter02;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.xml.xmp.XmpWriter;

/**
 * This example was written by Bruno Lowagie. It is part of the book 'iText in
 * Action' by Manning Publications. 
 * ISBN: 1932394796
 * http://www.1t3xt.com/docs/book.php 
 * http://www.manning.com/lowagie/
 */

public class HelloWorldAddMetadata {

	/**
	 * Generates a PDF file, then reads it to add some metadata.
	 * 
	 * @param args
	 *            no arguments needed here
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("Chapter 2: example HelloWorldAddMetadata");
		System.out.println("-> Creates a PDF file, then reads it;");
		System.out.println("   creates a new PDF file with extra metadata.");
		System.out.println("-> jars needed: iText.jar");
		System.out.println("-> files generated in /results subdirectory:");
		System.out.println("   HelloWorldNoMetadata.pdf");
		System.out.println("   HelloWorldStampedMetadata.pdf");
		// we create a PDF file
		createPdf("c:\\HelloWorldNoMetadata.pdf");
		// now we are going to inspect it
		try {
			// we create a PdfReader object
			PdfReader reader = new PdfReader("c:\\HelloWorldNoMetadata.pdf");
			System.out.println("Tampered? " + reader.isTampered());
			PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(
					"c:\\HelloWorldStampedMetadata.pdf"));
			System.out.println("Tampered? " + reader.isTampered());
			HashMap info = reader.getInfo();
			info.put("Subject", "Hello World");
			info.put("Author", "Bruno Lowagie");
			info.put("Keywords", "iText in Action, PdfStamper");
			info.put("Title", "Hello World stamped");
			info.put("Creator", "Silly standalone example");
			stamper.setMoreInfo(info);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			XmpWriter xmp = new XmpWriter(baos, info);
			xmp.close();
			stamper.setXmpMetadata(baos.toByteArray());
			stamper.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Generates a PDF file with bookmarks.
	 * 
	 * @param filename
	 *            the filename of the PDF file.
	 */
	private static void createPdf(String filename) {
		// we create a document with multiple pages and bookmarks
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filename));
			document.open();
			document.add(new Paragraph("Hello World"));
		} catch (DocumentException de) {
			System.err.println(de.getMessage());
		} catch (IOException ioe) {
			System.err.println(ioe.getMessage());
		}
		document.close();
	}
}