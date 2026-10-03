public class StudentMarks
{
    public static void main (String [] args)
    {
        int [] marks = {70,45,80,35,90};
        //1.traversal - print all marks
        System.out.println("Student Marks: ");

        for (int i=0; i< marks.length; i++)
        {
            System.out.println(marks[i]);
        }  
        //2. search - find 80
            int search = 80;
            
            for (int i=0; i< marks.length; i++)
            {
                if (marks[i] == search ) 
                {
                    System.out.println("80 found at index" +i);
                }
            }
            //3. counting - count students who passed 
            int count = 0;
            for (int i = 0 ; i< marks.length; i++ )
            {
                if (marks [i] >= 40)
                {
                    count++;
                }
            }
            System.out.println("Nunber of students passed :" +count);
            //4. Extremes - find highest and lowest
            int highest = marks[0];
            int lowest = marks[0];

            for (int i=1; i< marks.length;i++)
            {
                if (marks [i] > highest)
                {

                }
                
                if (marks[i]< lowest) {
                    lowest = marks[i];

                }
            }
            System.out.println("highest marks:" +highest);
             System.out.println("lowest marks:" +lowest);



        
    }


}
