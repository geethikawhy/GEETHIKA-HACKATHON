public class StudentMarksCalculationCaseStudyTest {
    public static void main (String [] args) {
        int Math_Marks = 10;
        int Java_Marks = 10;
        int DDCA_Marks = 10;
        int Total = Math_Marks + Java_Marks + DDCA_Marks;
        double average = Total / 3.0;
        if (Total >= 15) {
            System.out.println("pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("the total marks is : " + Total);
        System.out.println("the average marks is : " + average);

    }

}
