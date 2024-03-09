import java.util.Scanner;
class problem60{
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.println("enter n :");
        int n=mynum.nextInt();
        int j=1,sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+j;
            j=(j*10)+1;
        }
        System.out.println(sum);
    }
}