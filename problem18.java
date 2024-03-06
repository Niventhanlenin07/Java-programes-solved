import java.util.Scanner; 
public class problem18 {
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter a,b:"); 

        int a=mynum.nextInt(); 

        int b=mynum.nextInt(); 

        int x=69>>>2; 

        System.out.println(++a-b--); 

        System.out.println(a%b++); 

        System.out.println(a*=b+5); 

        System.out.println(x); 

    } 
}
