package chapter03;

import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfEncryptor;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * This example was written by Bruno Lowagie. It is part of the book 'iText in
 * Action' by Manning Publications. 
 * ISBN: 1932394796
 * http://www.1t3xt.com/docs/book.php 
 * http://www.manning.com/lowagie/
 */

public class HelloWorldEncryptDecrypt {

	/**
	 * Generates a simple PDF file with the text 'Hello World', encrypts it,
	 * then decrypts it.
	 * 
	 * @param args
	 *            no arguments needed here
	 */
	public static void main(String[] args) {
		System.out.println("Chapter 3: example HelloWorldEncryptDecrypt");
		System.out.println("-> Creates an encrypted PDF file with the text 'Hello World';");
		System.out.println("   then decrypts it.");
		System.out.println("-> jars needed: iText.jar");
		System.out.println("->              bcmail-jdk14-135.jar");
		System.out.println("->              bcprov-jdk14-135.jar");
		System.out.println("-> files generated in /results subdirectory:");
		System.out.println("   HelloWorldNotEncrypted.pdf");
		System.out.println("   HelloWorldEncrypted1.pdf");
		System.out.println("   HelloWorldEncrypted2.pdf");
		System.out.println("   HelloWorldDecrypted.pdf");

		// generate a Hello World PDF that isn't encrypted
		createPdf("c:/HelloWorldNotEncrypted.pdf");

		PdfReader reader;
		PdfStamper stamper;
		// encrypt the file with PdfStamper
		try {
			reader = new PdfReader("c:/HelloWorldNotEncrypted.pdf");
			stamper = new PdfStamper(reader, new FileOutputStream(
					"c:/HelloWorldEncrypted1.pdf"));
			stamper.setEncryption("Hello".getBytes(), "World".getBytes(),
					PdfWriter.ALLOW_PRINTING | PdfWriter.ALLOW_COPY,
					PdfWriter.STANDARD_ENCRYPTION_40);
			stamper.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}

		// encrypt the file
		try {
			PdfEncryptor.encrypt(new PdfReader("c:/HelloWorldNotEncrypted.pdf"),
					new FileOutputStream("c:/HelloWorldEncrypted2.pdf"),
					PdfWriter.STANDARD_ENCRYPTION_128, "Hello", "World",
					PdfWriter.ALLOW_DEGRADED_PRINTING);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}

		// decrypt the file
		try {
			reader = new PdfReader("c:/HelloWorldEncrypted2.pdf", "World"
					.getBytes());
			stamper = new PdfStamper(reader, new FileOutputStream(
					"c:/HelloWorldDecrypted.pdf"));
			stamper.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}

		try {
			getEncryptionInformation("c:/HelloWorldNotEncrypted.pdf", null);
			getEncryptionInformation("c:/HelloWorldEncrypted1.pdf", "World");
			getEncryptionInformation("c:/HelloWorldEncrypted2.pdf", "World");
			getEncryptionInformation("c:/HelloWorldDecrypted.pdf", null);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	/**
	 * Returns encryption information.
	 * 
	 * @param filename
	 * @param ownerpassword
	 * @throws IOException
	 */
	public static void getEncryptionInformation(String filename,
			String ownerpassword) throws IOException {
		PdfReader reader;
		if (ownerpassword == null)
			reader = new PdfReader(filename);
		else
			reader = new PdfReader(filename, ownerpassword.getBytes());
		System.out.println("=== Encryption info for " + filename + " ===");
		System.out.println("Encrypted? " + reader.isEncrypted());
		if (reader.isEncrypted()) {
			System.out.println("Permissions: "
					+ PdfEncryptor.getPermissionsVerbose(reader
							.getPermissions()));
			System.out.println("128 bit? " + reader.is128Key());
		}
	}

	/**
	 * Generates a PDF file saying Hello World.
	 * 
	 * @param filename
	 *            the filename of the PDF file.
	 */
	private static void createPdf(String filename) {
		Document document = new Document(PageSize.A4);
		try {
			PdfWriter.getInstance(document,	new FileOutputStream(filename));
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