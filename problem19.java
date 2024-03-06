import java.util.Scanner;
public class problem19 { 
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter a :"); 

        int a=mynum.nextInt(); 

        System.out.println(a+=a++ + ++a + -a + a--); 

    } 
}
