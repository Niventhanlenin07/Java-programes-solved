import java.util.Scanner;
public class problem22 { 
    public static void main(String[] args) { 
        Scanner mynum=new Scanner(System.in);
        System.out.println("enter y :"); 
        int y=mynum.nextInt();  
        System.out.println(y++ - ++y +y*5); 

    } 
}