import java.util.Scanner;
public class problem20 { 
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter x :"); 

        int x=mynum.nextInt(); 

        System.out.println(x=x++*2+3*-x); 

    } 
}
