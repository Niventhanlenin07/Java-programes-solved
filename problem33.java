import java.util.Scanner;
public class problem33 {
    public static void main(String[] args){
        Scanner mychar=new Scanner(System.in);
        System.out.println("enter x :");
        char x=mychar.next().charAt(0);
        if ((x>='a' && x<='z') || (x>='A' && x<='Z')){
            System.out.println("It\'s a alphabet");
        }else{
            System.out.println("It\'s not alphabet");
        }
    }
}