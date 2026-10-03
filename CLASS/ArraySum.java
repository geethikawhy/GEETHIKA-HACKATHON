public class ArraySum 
{
    public static void main (String [] args)
    {
        int [] n = {1,2,3,4,5,6};
        for(int i=0; i<n.length;i++)
        {
            System.out.println(n[i]);
        }
        int result =0;
        
        for(int i=1 ; i<=n.length ;i++)
        {
           result = result + i ;
           System.out.println(result);

        }
    }

}
