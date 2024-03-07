import java.util.Scanner;
public class problem32 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.println("enter n :");
        int n=mynum.nextInt();
        if (n>0){
            System.out.println("It\'s a positive number");
        }else if(n<0){
            System.out.println("It\'s a negative number");
        }else{
            System.out.println("It\'s a zero");
        }
    }
}