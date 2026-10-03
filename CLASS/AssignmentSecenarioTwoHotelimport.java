import java.util.*;
public class AssignmentSecenarioTwoHotelimport 
{
  public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Name of the customer");
      String customername = sc.next();
      System.out.println("Number of people staying");
      int noofpeople = sc.nextInt();
      System.out.println("What's your prefered");
      String room = sc.next();
      System.out.println("roomtype code");
        int roomtype = sc.nextInt();
        System.out.println("how many days are you staying");
        int numberOfDays = sc.nextInt();
        System.out.println("how many rooms do you need");
        int numberOfRooms = sc.nextInt();
        int roomPrice =0 ;
        int totalAmount;
        System.out.println("CUSTOMERNAME :" +customername);
        System.out.println("Number of people stating :" +noofpeople);
        System.out.println("room chose :" +room);
        

            switch (roomtype) {

                case 1:
                    System.out.println("Standard Room");
                    roomPrice = 2500;
                    break;

                case 2:
                    System.out.println("Deluxe Room");
                    roomPrice = 3500;
                    break;
                case 3:
                    System.out.println("Suite Room");
                    roomPrice = 5000;
                    break;  
                default:
                    System.out.println("Invalid Room Type");
            }

            totalAmount = roomPrice * numberOfDays * numberOfRooms;

            if (totalAmount < 5000) {
                System.out.println("Membership: Basic");
            }
            else if (totalAmount < 10000) {
                System.out.println("Membership: Silver");
            }
            else if (totalAmount < 15000) {
                System.out.println("Membership: Gold");
            }
            else {
                System.out.println("Membership: Platinum");
            }

            System.out.println("Total Amount: " + totalAmount);

            sc.close();
        
    }
}




