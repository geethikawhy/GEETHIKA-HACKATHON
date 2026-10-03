import java.util.*;
public class Factorial {
public static int Fac(int n)
{
     if(n<=0){
     return 1;}
     int res = Fac(n-1);
     return n*res;
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("which factorial you need");
        int n = sc.nextInt();
        Fac(n);
        int i= Fac(n) ;
        System.out.println("factorial of " +n +" is " +i );
        sc.close();
    }

}
