. ʹ��pdfbox

  ������������pdfbox

  http://pdfbox.apache.org/      �������أ� �������뾵��ҳ�棬ѡ�����ص�ַ

  http://sourceforge.net/projects/pdfbox/

. 		String filePath = "c:\\62375645.PDF",nr="";

		try {
			PDDocument doc=PDDocument.load(filePath); 
			PDFTextStripper stripper=new PDFTextStripper(); 
			nr = stripper.getText(doc);
			//nr = nr.replace(" ", "");
			doc.close();
	
			System.out.println("pdf���ݣ�"+nr);
		} catch ( Exception e ) {
			System.out.println("����!");
		}

. JAVA DOC ��URL

  http://pdfbox.apache.org/apidocs/overview-summary.html

. pdfbox ���ڱ����Ĳ���Ϊ:

  org.apache.pdfbox.filter ����, �������±����:

      ASCII85Filter

      ASCIIHexFilter

      CCITTFaxDecodeFilter

      CryptFilter

      DCTFilter

      FlateFilter

      IdentityFilter

      JBIG2Filter

      JPXFilter

      LZWDictionary

      LZWFilter

      LZWNode

      FunLengthDecodeFilter

      TIFFFaxDecoder

      