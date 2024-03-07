import java.util.Scanner;
public class problem35 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.println("enter n :");
        int n=mynum.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}