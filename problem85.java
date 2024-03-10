class problem85{
    static int m = 4;
    static int n = 4;
    static void row_sum(int arr[][]){
        int i, j, sum = 0;
        System.out.print("\nFinding Sum of each row:\n\n");
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of the row " + i + " = "
                               + sum);
            sum = 0;
        }
    }
    static void column_sum(int arr[][]){
        int i, j, sum = 0;
        System.out.print("\nFinding Sum of each column:\n\n");
        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                sum = sum + arr[j][i];
            }
            System.out.println("Sum of the column " + i+ " = " + sum);
            sum = 0;
        }
    }
    public static void main(String[] args){
        int i, j;
        int[][] arr = new int[m][n];
        int x = 1;
        for(i = 0; i < m; i++){
            for (j = 0; j < n; j++){
                arr[i][j] = x++;
            }
        }    
        row_sum(arr);
        column_sum(arr);
    }
}