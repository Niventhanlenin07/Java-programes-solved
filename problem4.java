import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter a,b :"); 

        int a=mynum.nextInt(); 

        int b=mynum.nextInt(); 

        int AND=a&b; 

        int OR=a|b; 

        int XOR=a^b; 

        int COMP=~a; 

        int LS=a<<b; 

        int RS=a>>b; 

        System.out.println(AND); 

        System.out.println(OR); 

        System.out.println(XOR); 

        System.out.println(COMP); 

        System.out.println(LS); 

        System.out.println(RS); 

    } 
}
