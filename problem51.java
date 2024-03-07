import java.util.Scanner;
public class problem51 {
    public static void main(String[] args){
    Scanner mynum=new Scanner(System.in);
    System.out.println("enter num :");
    int num=mynum.nextInt();
    int reversed=0;
    while(num!=0){
        reversed=(reversed*10)+(num%10);
        num=num/10;
    }
    System.out.println(reversed);
    }
}
