import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter n :"); 

        int n=mynum.nextInt(); 

        for (int i=n;i>=1;i--){ 

            for (int j=1;j<=i;j++){ 

                System.out.print((char)('A'-1+i)); 

            } 

            System.out.println(); 

        } 

    } 

} 
