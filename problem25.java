import java.util.Scanner;
public class problem25 {
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter a,b :"); 

        int a=mynum.nextInt();
        int b=mynum.nextInt();
        
        System.out.println("Quotient :"+a/b);
        System.out.println("Remainder :"+a%b);
    }    
}