import java.util.*; 
class problem54 { 
    static void list(int arr[], int n) { 
        Vector<Integer> evenArr = new Vector<Integer>(); 
        Vector<Integer> oddArr = new Vector<Integer>();
        for (int i = 0; i < n; i++) { 
            if (i % 2 != 1) { 
                oddArr.add(arr[i]); 
            } 
            else { 
                evenArr.add(arr[i]); 
            } 
        } 
        Collections.sort(oddArr, Collections.reverseOrder()); 
        Collections.sort(evenArr); 
        System.out.println("Decending order for odd position");
        int i = 0;
        for (int j = 0; j < oddArr.size(); j++) { 
            arr[i++] = oddArr.get(j);
            System.out.println(oddArr.get(j)+" ");
        }
        System.out.println(" ");
        System.out.println("Ascending order for even position");
        for (int j = 0; j < evenArr.size(); j++) { 
            arr[i++] = evenArr.get(j);
            System.out.println(evenArr.get(j)+" ");
        } 
    } 
    public static void main(String[] args) { 
        int arr[] = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0 }; 
        int n = arr.length; 
        list(arr, n); 
    } 
}  