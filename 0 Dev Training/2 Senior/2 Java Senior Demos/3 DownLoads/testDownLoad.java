import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

public class testDownLoad {

	public static void main(String[] args) 
	{
		String sURL ="http://vip.stock.finance.sina.com.cn/quotes_service/view/cn_bill_download.php?symbol=sz000002&num=60&sort=ticktime&asc=0&volume=40000&type=0";
		int nStartPos=0;
		int nRead=0;
		String sName="adams.csv";
		String sPath="f:\\";

		try {
			URL url	 = new URL(sURL);
			HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

			//获得文件长度
			long nEndPos =getFileSize(sURL);
			
			System.out.printf( "文件长度=%d", nEndPos );

			RandomAccessFile oSavedFile= new RandomAccessFile(sPath+"\\"+sName, "rw");
			httpConnection.setRequestProperty("User-Agent", "Internet Explorer");
			String sProperty = "bytes=" + nStartPos + "-";

			//告诉服务器book.rar这个文件从nStartPos字节开始传
			httpConnection.setRequestProperty("RANGE", sProperty);
			System.out.println(sProperty);
			InputStream input = httpConnection.getInputStream();

			byte[] b = new byte[1024];

			//读取网络文件,写入指定的文件中
			//while ((nRead = input.read(b, 0, 1024)) > 0 && nStartPos < nEndPos ) {
			while ((nRead = input.read(b, 0, 1024)) > 0  ) {
				oSavedFile.write(b, 0, nRead);
				nStartPos += nRead;
			}
			httpConnection.disconnect();
		} catch (Exception e) {
			System.out.printf( "出异常了", ":P");
			e.printStackTrace();
		}
	}

	//  获得文件长度
	public static long getFileSize(String sURL)
    {
 		int	nFileLength = -1;

		try {
			URL url = new URL(sURL);
			HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
			httpConnection.setRequestProperty("User-Agent", "Internet Explorer");

			int responseCode = httpConnection.getResponseCode();

			System.out.printf( "responseCode = %d\n", responseCode  );
			if (responseCode >= 400) {
				System.err.println("Error Code : " + responseCode);
				return -2; // -2 represent access is error
			}

			String sHeader;
			for (int i = 1;; i++) {
				sHeader = httpConnection.getHeaderFieldKey(i);
				
				System.out.printf( "\nsHeader=%s\n", sHeader );
				
				if (sHeader != null) {
					if (sHeader.equals("Content-Length")) {
						nFileLength = Integer.parseInt(httpConnection.getHeaderField(sHeader));
						break;
					}
					if (sHeader.equals("Content-Type")) {
						// 参见:
						//    
						System.out.printf("Content-Type = %s", httpConnection.getHeaderField(i) );
						break;
					}
					
				} else
					break;
			}
		} catch (IOException e) {
			System.out.println("获得文件大笑时IOException ");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("获得文件大笑时Exception ");
			e.printStackTrace();
		}
		System.out.println(nFileLength);
		return nFileLength;
	}
}

