import java.util.Arrays;
public class problem37 {
    static void mynum(int list[]){
        for(int i=0;i<list.length;i+=2){
            System.out.println(list[i]);
        }
    }
    public static void main(String[] args){
        int list[]={1,3,7,8,5,6};
        mynum(list);
    }
}