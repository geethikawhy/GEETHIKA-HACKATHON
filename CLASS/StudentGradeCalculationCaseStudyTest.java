import java.util.Scanner;
public class StudentGradeCalculationCaseStudyTest {
   public static void main (String [] args){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter marks");
    int n = scn.nextInt();
    if ( n>= 40) {
        System.out.println("Pass");
    } else {
        System.out.println("Fail");
    }
    scn.close();
   }
}
