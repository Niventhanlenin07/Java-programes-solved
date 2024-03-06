import java.util.Scanner;
public class problem30 {
    public static void main(String[] args){
        Scanner mynum=new Scanner(System.in);
        System.out.println("enter x,y,z :");
        int x=mynum.nextInt();
        int y=mynum.nextInt();
        int z=mynum.nextInt();
        int a=Math.max(x,y);
        System.out.println(Math.max(a,z));
    }    
}    