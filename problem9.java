import java.util.Arrays;
class problem9{
    public static void main(String[] args) {
        int arr1[] = {2,4,5,7,9,10};
        int n1 = arr1.length;
        int arr2[] = {3,6,8,11,13,15};
        int n2 = arr2.length;
        int arr3[] = new int[n1 + n2];
        mergeArrays(arr1, arr2, n1, n2, arr3);
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }
    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3){
        int i = 0;  
        int j = 0;  
        int k = 0;  
        while(i < n1){   
         arr3[k++] = arr1[i++];   
        }   
        while(j < n2){   
         arr3[k++] = arr2[j++];
        }   
        Arrays.sort(arr3);   
    }
}