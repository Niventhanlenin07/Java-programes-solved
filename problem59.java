class program59{
    static int substring(String s1, String s2){
        int M = s1.length();
        int N = s2.length();
        for (int i = 0; i <= N-M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;
            if (j == M)
            return i;
        }
 
        return -1;
    }
    public static void main(String args[]){
        String s1 = "123";
        String s2 = "test 123 string";
 
        int res = substring(s1, s2);
 
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " + res);
    }
}      