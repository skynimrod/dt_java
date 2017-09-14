. 使用pdfbox

  先在网上下载pdfbox

  http://pdfbox.apache.org/      可以下载， 点击后进入镜像页面，选择下载地址

  http://sourceforge.net/projects/pdfbox/

. 		String filePath = "c:\\62375645.PDF",nr="";

		try {
			PDDocument doc=PDDocument.load(filePath); 
			PDFTextStripper stripper=new PDFTextStripper(); 
			nr = stripper.getText(doc);
			//nr = nr.replace(" ", "");
			doc.close();
	
			System.out.println("pdf内容："+nr);
		} catch ( Exception e ) {
			System.out.println("出错!");
		}

. JAVA DOC 的URL

  http://pdfbox.apache.org/apidocs/overview-summary.html

. pdfbox 关于编解码的部分为:

  org.apache.pdfbox.filter 包中, 包含以下编解码:

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

      