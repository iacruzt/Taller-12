
public class ClientClass
{

    public static void main (String [] args)
    {
        FibonacciThread f1 = new FibonacciThread ( 20 );
        FibonacciThread f2 = new FibonacciThread ( 50 );
        Thread f3 = new Thread ( new FibonacciRunnable ( 100 ) );

        //f1.start();
        f2.start();
        //f3.start();
    }

}
