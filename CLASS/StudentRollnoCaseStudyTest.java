import java.util.Scanner;
public class StudentRollnoCaseStudyTest {
    public static void main (String [] args){
       System.out.println("Enter the roll number");
        Scanner scn = new Scanner (System.in);
        
        int [] student_rollno = new int[10];
        
        for  ( int i =0 ; i<student_rollno.length; i++){
            student_rollno[i] = scn.nextInt();
        }
        System.out.println("the roll numbers are");
        for  ( int i =1 ; i<student_rollno.length; i++){
            System.out.println("Student " +i  +" roll number : " +student_rollno[i]);
        }
        scn.close();

}
    }

