public class MyThread extends Thread
{
    int count= 1, number;
    
    public MyThread( int num ) 
    {
        number = num;
        System.out.println( "�����߳� " + number );
    }

    public void run() 
    {
        while( true ) {
          System.out.println( "�߳� " + number + ":���� " + count );
          if ( ++ count == 6 ) return;
        }
    }
    
    public static void main( String args[] )
    {
        for( int i = 0; i < 5; i ++ ) new MyThread(i+1).start( );
    }
}