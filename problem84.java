import java.io.*;
class problem84 {
    public static void findFreq(int[][] arr, int m, int n){
        int even = 0, odd = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
        }
        System.out.println("Odd Number Frequency: " + odd);
        System.out.println("Even Number Frequency: "+ even);
    }
    public static void main(String[] args){
        int m = 3, n = 5;
        int[][] arr = { { 3, 4, 5, 6, 3 },
                        { 4, 3, 2, 7, 9 },
                        { 1, 5, 7, 2, 4 } };
        findFreq(arr, m, n);
    }
}