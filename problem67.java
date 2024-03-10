import java.util.ArrayList; 
public class problem67 { 
    static void duplicates( int arr[], int len) { 
        boolean ifPresent = false;
        ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        for (int i = 0; i < len - 1; i++) { 
            for (int j = i + 1; j < len; j++) { 
                if (arr[i] == arr[j]) { 
                    if (a1.contains(arr[i])) { 
                        break; 
                    } 
                    else { 
                        a1.add(arr[i]); 
                        ifPresent = true; 
                    } 
                } 
            } 
        } 
        if (ifPresent == true) { 
  
            System.out.print(a1 + " "); 
        } 
        else { 
            System.out.print("No duplicates present in arrays"); 
        } 
    } 
    public static void main(String[] args) 
    { 
  
        int arr[] = {1,3,4,5,6,7,8,9,2,3,4,6}; 
        int n = arr.length; 
        duplicates(arr, n); 
    } 
}