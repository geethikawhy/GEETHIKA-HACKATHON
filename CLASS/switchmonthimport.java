import java.util.*;
public class switchmonthimport {
    public static void main (String [] agrs)
    {
    
        
       Scanner sc = new Scanner (System.in);
         int month = sc.nextInt();
        String monthname;
        switch (month){
        case 1 : 
        monthname = "January";
        break;
        case 2 : 
        monthname = "Feburary" ;
        break;
        case 3 :
        monthname =  "March";
        break; 
        case 4 :
        monthname =  "April";
        break;
        case 5 : 
        monthname = "May";
        break;
        case 6 :
        monthname =  "june";
         break; 
        case 7 : 
        monthname = "july";
         break; 
        case 8 :
        monthname =  "august";
         break; 
        case 9 :
        monthname =  "september";
         break; 
        case 10 :
        monthname =  "october";
         break; 
        case 11 : 
        monthname = "november";
         break; 
        case 12 :
        monthname =  "december";
         break; 
         default: 
             monthname = "invalid";
    }
System.out.println("month : " + monthname);
sc.close();


    }                                                                                                                                                                                                                                                                                                                                                                                                                   
}
