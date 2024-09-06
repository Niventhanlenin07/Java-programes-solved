import java.util.Arrays;
class problem94{
    public static void main(String args[]){
        String n1="hello";
        String n2="elloh"; 
        System.out.println(anaGram(n1,n2));  
    }
    public static boolean anaGram(String n1,String n2){
        boolean value=false;
        char[] arr1=n1.toCharArray();
        char[] arr2=n2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            value=true;
        }
        return value;
    }
}    
