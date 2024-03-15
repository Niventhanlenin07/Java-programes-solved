import java.util.Scanner;
class problem99{
    public static void main(String[] args){
        Scanner mychar=new Scanner(System.in);
        System.out.println("enter the letter");
        String x=mychar.nextLine();
        char[] arr=x.toCharArray();
        for (int i=0;i<arr.length;i++){
            if (arr[i]>='a' && arr[i]<='z'){
                arr[i]=(char)(arr[i]-32);
            }
        }
        x=new String(arr);
        System.out.println(x);
    }
}
