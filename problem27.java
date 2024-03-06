import java.util.Scanner;
public class problem27 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.println("enter x,y :");
        int x=mynum.nextInt();
        int y=mynum.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);
    }
}
