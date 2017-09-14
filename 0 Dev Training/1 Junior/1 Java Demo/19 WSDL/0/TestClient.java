import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import javax.xml.namespace.QName;

public class TestClient {

	public static void main(String [] args) {
		try {
			String endpoint ="http://ws.apache.org:5049/axis/services/echo";

			Service service = new Service();
			Call call = (Call) service.createCall();

 			call.setTargetEndpointAddress( new java.net.URL(endpoint) );
 			call.setOperationName(new QName("http://soapinterop.org/", "echoString"));

 			String ret = (String) call.invoke( new Object[] { "Hello!" } );

 			System.out.println("Sent 'Hello!', got '" + ret + "'");
 		} catch (Exception e) {
 			System.err.println(e.toString());
 		}
 	}
}

/*

  编译:  javac TestClient.java

     出错， 因为import 的jar (org.apache.axis.client) 包没有. 下载axis 安装后再尝试.

     需要 axis.jar, 下载后可以拷贝到jre\lib 下

*/