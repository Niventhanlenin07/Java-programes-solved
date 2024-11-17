import java.util.Scanner; 
public class problem1{ 
    public static void main(String[] args) { 
        Scanner mynum=new Scanner(System.in); 

        System.out.println("enter n "); 

        int n=mynum.nextInt(); 

        System.out.println("MULTIPLICATION TABLE"); 

        for (int i=1;i<=10;i++){ 

            System.out.println(i+"*"+n+"="+i*n); 

        } 

        System.out.println("SUBTRACTION TABLE"); 

        for (int j=1;j<=10;j++){ 

            if (j>=n){ 

                System.out.println(j+"-"+n+"="+(j-n)); 

            }     

        }     

    } 

}

