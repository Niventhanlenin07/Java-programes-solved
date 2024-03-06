import java.util.Scanner;
public class problem15 { 
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter pi,r,h :"); 

        float pi=mynum.nextFloat(); 

        int r=mynum.nextInt(); 

        int h=mynum.nextInt(); 

        float area1=2*pi*r; 

        int area2=r+h; 

        float area=area1*area2; 

        System.out.println(area); 

    } 
}
