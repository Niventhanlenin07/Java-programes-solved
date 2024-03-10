class problem66{
    static void leftrotate(int arr[], int d, int n){
        for (int i = 0; i < d; i++)
            lrotate(arr, n);
    }
    static void lrotate(int arr[], int n){
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
    static void list(int arr[], int n){
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args){
        problem43 rotate = new problem43();
        int arr[] = { 1, 2, 3, 4, 5 };
        int d=2;
        int n=arr.length;
        rotate.leftrotate(arr,d,n);
        rotate.list(arr,n);
    }
}
