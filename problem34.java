import java.util.Scanner;
public class problem34 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.println("enter n :");
        int n=mynum.nextInt();
        int sum_natural=(n*(n+1))/2;
        System.out.println(sum_natural);
    }
}