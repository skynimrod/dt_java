public class MyThread2 implements Runnable
{
    int count= 1, number;
    
    public MyThread2( int num ) 
    {
        number = num;
        System.out.println( "�����߳� " + number );
    }

    public void run() 
    {
        synchronized(this) {
            while( true ) {
                System.out.println( "�߳� " + number + ":���� " + count );
                if ( ++ count == 6 ) return;
            }
      }
    }
    
    public static void main( String args[] )
    {
        for( int i = 0; i < 5; i ++ ) new Thread( new MyThread2(i+1) ).start( );
    }
}