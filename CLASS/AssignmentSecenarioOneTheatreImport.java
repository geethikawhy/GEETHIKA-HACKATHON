import java.util.*;
public class AssignmentSecenarioOneTheatreImport 
{
 public static void main(String [] args)
 {
    Scanner sc = new Scanner(System.in);
        
        System.out.println("Customer name");
        String customerName = sc.next();
       System.out.println("Showname");
        String showName = sc.next();
        System.out.println("Number of tickets");
        int numberOfTickets = sc.nextInt();
    
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

        sc.close();

 }
}


