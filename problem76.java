class problem76{ 
    static int N = 4; 
    static void transpose(int A[][], int B[][]) { 
        int i, j; 
        for (i = 0; i < N; i++) 
            for (j = 0; j < N; j++) 
                B[i][j] = A[j][i]; 
    } 
    public static void main(String[] args) { 
        int A[][] = { { 1,3,5,7 }, 
                      { 2,4,6,8 }, 
                      { 3,6,9,12}, 
                      { 4,8,12,16} }; 
  
        int B[][] = new int[N][N], i, j; 
        transpose(A, B); 
        System.out.print("Result matrix is \n"); 
        for (i = 0; i < N; i++) { 
            for (j = 0; j < N; j++) 
                System.out.print(B[i][j] + " "); 
            System.out.print("\n"); 
        } 
    } 
} 