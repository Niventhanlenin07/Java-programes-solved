import java.util.Scanner;
public class problem14 { 
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter length,width :"); 

        int length=mynum.nextInt(); 

        int width=mynum.nextInt(); 

        int area=length*width; 

        System.out.println(area); 

    } 
}
