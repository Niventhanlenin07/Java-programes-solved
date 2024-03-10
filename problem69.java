class problem69 {
    static void rightrotate(int arr[], int d, int n){
        while (d > n) {
            d = d - n;
        }
        int temp[] = new int[n - d];
        for (int i = 0; i < n - d; i++)
            temp[i] = arr[i];
        for (int i = n - d; i < n; i++) {
            arr[i - n + d] = arr[i];
        }
        for (int i = 0; i < n - d; i++) {
            arr[i + d] = temp[i];
        }
    }
    static void list(int arr[], int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args){
        problem46 rotate = new problem46();
        int arr[] = { 1, 2, 3, 4, 5 };
        int d=2;
        int n=arr.length;
        rotate.rightrotate(arr,d,n);
        rotate.list(arr,n);
    }
}