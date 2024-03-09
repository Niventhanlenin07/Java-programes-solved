import java.util.Scanner;
public class problem56 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.print("enter n :");
        int n=mynum.nextInt();
        int num=1;
        for (int i=1;i<=n;i++){
            if (i==5){
                break;
            }
            for (int s=1;s<=4-i;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
