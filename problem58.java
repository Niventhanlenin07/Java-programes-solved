class probtlem58{
    public static void main(String[] args) {
        System.out.println("* * * * * * * *");
        for (int i=1;i<=5;i++){
            for (int j=4;j>0;j--){
                System.out.print("*"+" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("_");
            }    
            for (int j=4;j>0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=5;i++){
            for (int j=4;j>0;j--){
                System.out.print("*"+" ");
            }
            for (int j=4;j>=i;j--){
                System.out.print("_");
            }    
            for (int j=4;j>0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}