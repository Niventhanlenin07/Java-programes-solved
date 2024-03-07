public class problem42 {
    static void mynum(int arr[]){
        boolean num[]=new boolean[arr.length];
        for (int i=0;i<arr.length;i++){
            if(num[i]==true)
                continue;
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    num[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
    }    
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,4,3,2,1};
        mynum(arr);
    }    
}   