public class AddingTest
{
    public static void main (String args[])
    {
        int test1[] = {25,35,40,45,46};
        int test2[] = {40,41,50,60,75};
        int total [] = new int[5];

        for (int i= 0; i< test1.length ; i++)
        {
            total[i] = test1[i] + test2[i];
        }
             System.out.println("stuent total marks");
             for (int i= 0; i< test1.length ; i++)
            {
                System.out.print("\t :" + total[i]);
            }

    }

}
