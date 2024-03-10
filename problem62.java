import java.util.Arrays;
public class problem62 {
    static void mynum(int list[]){
        System.out.println("even position");
        for(int i=1;i<list.length;i+=2){
            System.out.println(list[i]);
        }
        System.out.println("odd position");
        for(int i=0;i<list.length;i+=2){
            System.out.println(list[i]);
        }
    }
    public static void main(String[] args){
        int list[]={1,3,7,8,5,6};
        mynum(list);
    }
}