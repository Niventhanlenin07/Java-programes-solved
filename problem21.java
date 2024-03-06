import java.util.Scanner;
public class problem21 { 
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter y :"); 

        int y=mynum.nextInt(); 

        int z=(++y * (y++ + 5));  

        System.out.println(z); 

    } 
}
