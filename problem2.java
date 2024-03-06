import java.util.Scanner; 
public class problem2 { 
    public static void main(String[] args) { 

        Scanner mychar=new Scanner(System.in); 

        System.out.println("enter n :"); 

        char n=mychar.next().charAt(0); 

        for (int i=65;i<=90;i++){ 

            char b=((char)i); 

            if (b>=n){ 

                System.out.print(b+" "); 

            } 

             

        }     

    } 

}
