class problem81{ 
    static final int N = 4; 
    static int equal(int A[][], int B[][]) { 
        for (int i = 0; i < N; i++){ 
            for (int j = 0; j < N; j++){ 
                if (A[i][j] != B[i][j]){
                    return 0;
                }  
            return 1; 
            }
        }    
    } 
    public static void main (String[] args) { 
        int A[][] = { {1, 1, 1, 1}, 
                      {2, 2, 2, 2}, 
                      {3, 3, 3, 3}, 
                      {4, 4, 4, 4}}; 
      
        int B[][] = { {1, 1, 1, 1}, 
                      {2, 2, 2, 2}, 
                      {3, 3, 3, 3}, 
                      {4, 4, 4, 4}}; 
        if (equal(A, B) == 1){ 
            System.out.print("Matrices are identical"); 
        }else{
            System.out.print("Matrices are not identical");
        }     
    } 
}