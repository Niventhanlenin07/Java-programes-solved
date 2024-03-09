import java.util.Scanner;
public class problem48 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.print("enter n :");
        int n=mynum.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int j=i;j>0;j++){
                System.out.print(j);
            }
            for (int j=i;j<=n;j++){
                if (i==j){
                    continue;
                }
            System.out.println();
        }
    }
}
}