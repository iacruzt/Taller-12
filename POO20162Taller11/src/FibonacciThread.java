import java.math.BigInteger;

public class FibonacciThread extends Thread
{

    // ------------------------------------------------------------------ ATTRIBUTES

    private int finalPosition;

    // ------------------------------------------------------------------ CONSTRUCTORS

    public FibonacciThread ()
    {
        // Default constructor here!
    }

    public FibonacciThread ( int finalPosition )
    {
        this.finalPosition = finalPosition;
    }

    // ------------------------------------------------------------------ METHODS

    public void printSeries ()
    {
        BigInteger lastTerm, currentTerm, aux;

        currentTerm = BigInteger.valueOf (0);
        System.out.print ("\n" + currentTerm + " ");
        /*
        The first term of the series is zero, by definition.
        So far, the current term is the only term, so there is no last term.
         */

        aux = currentTerm;
        currentTerm = BigInteger.valueOf (1);
        lastTerm = aux;
        System.out.print (currentTerm + " ");

        /*
        The second term of the series is 1, by definition.
        We have two terms now: 0 and 1. 0 is the last currentTerm, also known as lastTerm. From now on, the current
        term will be the sum of both the last term and the current term. That's the logic implemented within the for
        loop.
         */

        for ( int i = 2 ; i < this.finalPosition ; i = i + 1 )
        {
            aux = currentTerm;
            currentTerm = currentTerm.add ( lastTerm );
            lastTerm = aux;
            System.out.print (currentTerm + " ");
        }
    }

    public void run ()
    {
        this.printSeries();
    }
}
