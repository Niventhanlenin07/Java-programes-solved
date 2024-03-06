import java.util.Scanner;
public class problem16 { 
     public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter a,b,c :"); 

        int a=mynum.nextInt(); 

        int b=mynum.nextInt(); 

        int c=mynum.nextInt(); 

        double d=(-b+Math.sqrt((b*b)-(4*a*c)))/2*a; 

        double e=(-b-Math.sqrt((b*b)-(4*a*c)))/2*a; 

        System.out.println(d+","+e); 

    } 
}
