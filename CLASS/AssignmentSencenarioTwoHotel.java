public class AssignmentSencenarioTwoHotel 
{
    public static void main(String[] args) {

        int roomType = 2;
        int numberOfDays = 3;
        int numberOfRooms = 1;
        int roomPrice = 0;
        int totalAmount;

        for (int i = 1; i <= 2; i++) {

            switch (roomType) {

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

            System.out.println("Total Amount: ₹" + totalAmount);
        }
    }
}


