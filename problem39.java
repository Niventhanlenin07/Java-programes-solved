public class problem39 {
    static void mynum(int arr[]){
        int min=arr[0];  
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        } 
        System.out.println(min);
    }       
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        mynum(arr);
    }    
}   