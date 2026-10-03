public interface CaseStudyOnlineShopping {}

    

    
    public static double calculateTotal(double[] prices) {
        double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    
    public static double discount(double total, double discountPercentage) {
        return total * (discountPercentage / 100.0);
    }


    public static double discount(double total, int fixedDiscount) {
        return fixedDiscount;
    }

    
    public static void displayPrices(double[] prices) {
        System.out.println("--- Product Prices ---");
        int count = 1;
        for (double price : prices) {
            System.out.println("Product " + count + ": $" + price);
            count++;
        }
    }

    // Method to calculate and return the final bill amount
    public static double finalbill(double total, double discount) {
        double finalAmount = total - discount;
        return (finalAmount < 0) ? 0.0 : finalAmount; // Prevent negative final amount
    }

    public static void main(String[] args) {
        
        double[] prices = {29.99, 45.50, 12.00, 89.95, 15.75};

       
        displayPrices(prices);

        
        double totalAmount = calculateTotal(prices);
        System.out.println("\nTotal Price: " + totalAmount);

        
        double percentageDiscount = discount(totalAmount, 15.0); // 15% discount
        double fixedDiscount = discount(totalAmount, 20);        // $20 fixed discount

        System.out.println("Percentage Discount (15%): " + percentageDiscount);
        System.out.println("Fixed Discount 20): " + fixedDiscount);

        double finalBillWithPercentage = finalbill(totalAmount, percentageDiscount);
        double finalBillWithFixed = finalbill(totalAmount, fixedDiscount);

        System.out.println("\nFinal Amount Payable (Percentage Discount applied) " + finalBillWithPercentage );
        System.out.println("Final Amount Payable (Fixed Discount applied): " + finalBillWithFixed);
    

    
    }
    
    


