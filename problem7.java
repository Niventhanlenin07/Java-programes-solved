class problem7{ 
    static void pattern(String numbers, int len) { 
        for (int i = 0; i <len; i++) { 
            int j = len-1- i; 
            for (int k = 0; k < len; k++) { 
                if (k == i || k == j) 
                    System.out.print(i+1); 
                else
                    System.out.print(" "); 
            } 
            System.out.println(""); 
        } 
    } 
    public static void main(String[] args) { 
        String numbers = "12345"; 
        int len = numbers.length(); 
        pattern(numbers, len); 
    } 
} 