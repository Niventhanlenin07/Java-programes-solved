public class problem68 {
    static void mynum(int arr[]){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }    
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,4,3,2,1};
        mynum(arr);
    }    
}   