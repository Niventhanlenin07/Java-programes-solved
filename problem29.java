import java.util.Scanner;
public class problem29 {
    public static void main(String[] args){
        Scanner mychar=new Scanner(System.in);
        System.out.println("enter t :");
        char y=mychar.next().charAt(0);
        if (y=='A' || y=='E' || y=='I' || y=='O' || y=='U' || y=='a' || y=='e' || y=='i' || y=='o' || y=='u'){
            System.out.println("It\'s a vowel");
        }else{
            System.out.println("It\'s a consonant");
        }
    }
}
