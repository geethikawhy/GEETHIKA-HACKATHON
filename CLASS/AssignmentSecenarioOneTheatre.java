
    
public class AssignmentSecenarioOneTheatre
 {

    public static void main(String[] args)
     {

        String customerName = "Maya";
        String showName = "Comedy Show";
        int numberOfTickets = 5;
        int ticketPrice = 600;
        int totalAmount = numberOfTickets * ticketPrice;
        int discount = 500;
        boolean seatAvailable = true;
        

        System.out.println("Customer Name: " + customerName);
        System.out.println("Show Name: " + showName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Total Amount: " + totalAmount);
        if ( totalAmount >= 3000 )
        {
            System.out.println("discount given = 500");
            System.out.println("To Pay =  " + (totalAmount - discount));
        }
        else{
            System.out.println("discount given = 00");
             System.out.println(" To Pay =  "  +totalAmount);
        }
        
        System.out.println("Seat Available: " + seatAvailable);

    }
}
