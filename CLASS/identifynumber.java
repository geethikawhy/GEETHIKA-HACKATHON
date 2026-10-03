import java.util.*;
  class identifynumber
{
public static void main (String [] args )
{
  Scanner scn = new Scanner (System.in);
   int n = scn.nextInt();
    if ( n > 0 )
    {
      System.out.println("number " +n+ " is positive");
    }
     else if ( n<0) 
      {
        System.out.println("number " +n+ " is negative");    
        }
      else 
     {
   System.out.println("number is zero");    
        }
        scn.close();



}
  }      