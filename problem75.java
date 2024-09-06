import java.util.Scanner;
public class problem75 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.println("enter n :");
        int n=mynum.nextInt();
        if (n%2==0){
            System.out.println("It\'s a even number");
        }else{
            System.out.println("It\'s a odd number");
        }
    }
}