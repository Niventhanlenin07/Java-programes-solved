import java.util.Scanner; 
public class problem3 {
    public static void main(String[] args) { 

        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter n :"); 

        int n=mynum.nextInt(); 

        int n1=n; 

        int reversed_num=0; 

        while (n1!=0){ 

           reversed_num=(reversed_num*10)+(n1%10); 

           n1=n1/10; 

        } 

        int c=reversed_num; 

        System.out.println("Reversed_num :"+c); 

        int sub=n-c; 

        System.out.println("Sub_value :"+sub); 

    } 
}
