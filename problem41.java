public class problem41 {
    public static void main(String[] args){
        int a[]={1,2,3,4,5};
        int b[]=new int[a.length];
        b=a;
        for (int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
