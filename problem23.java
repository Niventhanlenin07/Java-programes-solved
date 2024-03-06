import java.util.Scanner;
public class problem23 {
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter x :"); 

        int x=mynum.nextInt(); 

        int x1=++x-x++ +-x; 

        System.out.println(x1); 

    } 
}
