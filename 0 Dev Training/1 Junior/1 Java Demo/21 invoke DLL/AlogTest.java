import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

// loadLibrary(String name, Class interfaceClass)

public class AlogTest {
	
	public interface CLibrary extends Library {
		CLibrary INSTANCE = (CLibrary)Native.loadLibrary(
			(Platform.isWindows() ? "alog" : "c"), 
			CLibrary.class );

		long wlog( String format, String msg );
	}

	public static void main( String[] args ) {
		long a = CLibrary.INSTANCE.wlog( "testlog", "Hello, World\n" );
		System.out.println("-----" + a );
	}
}