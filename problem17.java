import java.util.Scanner; 
public class problem17 {
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter pi,r1,r2 :"); 

        float pi=mynum.nextFloat(); 

        int r1=mynum.nextInt(); 

        int r2=mynum.nextInt(); 

        float area1=pi*(r1*r1); 

        float area2=pi*(r2*r2); 

        float area=area1-area2; 

        System.out.println(area); 

    } 
}
