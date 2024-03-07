public class problem38 {
    static void mynum(int arr[]){
        int max=arr[0];  
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        } 
        System.out.println(max);
    }       
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        mynum(arr);
    }    
}    