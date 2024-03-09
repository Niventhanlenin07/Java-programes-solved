import java.util.Scanner;
public class problem47 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.print("enter n :");
        int n=mynum.nextInt();
        for (int i=1;i<=n;i++){
            for (int s=1;s<=9-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i;j>0;j--){
                if (i==j){
                    continue;
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}