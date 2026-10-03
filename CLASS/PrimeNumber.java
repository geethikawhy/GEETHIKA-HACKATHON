public class PrimeNumber
{
    public static void main (String [] args)
    {
        int n= 5 ;
        if( n<= 1 ) 
        {
            System.out.println("Not prime");
            return;
        }
        int count = 0 ;
        int i ;
        for  (i = 1; i <= n; i++)
        {
        if (n%i == 0) count++;
        }
        if ( count >2 ) System.out.println("not prime");
        else System.out.println("prime");
    }
}
    

