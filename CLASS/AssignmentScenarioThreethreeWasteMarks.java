import java.util.Scanner;
public class AssignmentScenarioThreethreeWasteMarks
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                System.out.print("Enter mark: ");
                marks[i][j] = sc.nextInt();
            }
        }  
                sc.close();
            
        
    }
}