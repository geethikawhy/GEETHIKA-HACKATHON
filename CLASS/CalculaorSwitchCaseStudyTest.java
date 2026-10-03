import java.util.Scanner;
public class CalculaorSwitchCaseStudyTest {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number");
        int a = sc.nextInt();
        System.out.println("Number");
        int b = sc.nextInt();
        System.out.println("operation 1.add 2.subtract 3.multiply 4.divide");
        int operation = sc.nextInt();
        int c;
    

        switch (operation) {
            case 1:
                c = a+b;
                System.out.println("the sum is :" +c);
                
                
                break;
            case 2:     
                c = a-b;
                System.out.println("the difference is :" +c);
                break; 
            case 3:
                c = a*b;
                System.out.println("the product is :" +c);
                break;
            case 4:
                c = a/b;
                System.out.println("the quotient is :" +c);
                break;  
            default :
                    System.out.println("Invalid choice");
                    break;
        }
        sc.close();
    }

}
