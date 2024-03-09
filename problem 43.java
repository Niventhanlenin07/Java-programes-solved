class problem43 {
    static void leftrotate(int arr[], int d, int n){ 
        d=d%n;
        int temp[] = new int[n];
        int a = 0;
        for (int i = d; i < n; i++) {
            temp[a] = arr[i];
            a++;
        }
        for (int i = 0; i < d; i++) {
            temp[a] = arr[i];
            a++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
    static void numbers(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
        public static void main (String[] args) {
            int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
            int n = arr.length;
            int d = 2;
            leftrotateotate(arr, d, n);
            numbers(arr, n);
        }
    }