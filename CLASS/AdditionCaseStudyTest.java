import java.util.Scanner;
public class AdditionCaseStudyTest {
    public static int add (int a, int b){
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the values");
        int a = scn.nextInt();
        int b = scn.nextInt();
        add(a, b);
        int result = add(a, b);
        System.out.println("The answer is: " + result);
        scn.close();
    }

}
