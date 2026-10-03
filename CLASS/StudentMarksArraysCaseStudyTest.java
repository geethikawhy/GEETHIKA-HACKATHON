import java.util.Scanner;
public class StudentMarksArraysCaseStudyTest {
 public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the marks");
    int [] marks = new int[5];
    
    for  ( int i =0 ; i<marks.length; i++){
        marks[i] = sc.nextInt();
    }
    System.out.println("the marks are");
    for  ( int i =0 ; i<marks.length; i++){
System.out.println(marks[i]);
    }
        sc.close();
    
 }
}
