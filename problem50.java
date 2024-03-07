import java.util.Scanner;
public class problem50 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.print("enter n :");
        int n=mynum.nextInt();
        for (int i=n;i>0;i--){
            for (int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
