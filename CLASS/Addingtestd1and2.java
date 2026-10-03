 class AddingTest1and2
{
    public static void main (String args[])
    {
        int test1[] = {25,35,40,45,46};
        int test2[] = {40,41,50,60,75};

        for (int i= 0; i< test1.length ; i++)
        {
            int total = test1[i] + test2[i];
             System.out.println("Student" + (i+1) + "total marks :"  +total);
        }

    }
}