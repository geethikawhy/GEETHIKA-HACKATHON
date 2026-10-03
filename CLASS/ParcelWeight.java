import java.util.Scanner;
public class ParcelWeight {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter parcel weight");
            double weight = Double.parseDouble(sc.nextLine());
            if(weight>0 && weight<50){
                System.out.println("Weight accepted:" +weight+"kg");
            }
            else{
                System.out.println("Invalid weight." + "\n " + "Please enter a valid number" + "\n" + " " + "Number should be a positive number" +"\n " + "Weight should be less than 50kg");
            }
        }
        catch(NumberFormatException e){
            System.out.println("Invalid weight." + "\n " + "Please enter a valid number" + "\n" + " " + "Number should be a positive number" +"\n " + "Weight should be less than 50kg");
        }
        finally{
            System.out.println("Weight checking completed");
        }
        sc.close();
    }

}
