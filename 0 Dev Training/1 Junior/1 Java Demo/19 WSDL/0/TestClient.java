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

  ����:  javac TestClient.java

     ���� ��Ϊimport ��jar (org.apache.axis.client) ��û��. ����axis ��װ���ٳ���.

     ��Ҫ axis.jar, ���غ���Կ�����jre\lib ��

*/