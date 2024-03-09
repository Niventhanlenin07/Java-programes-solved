class probelm52{
    static void reverse(char str[], int start, int end){
        char temp;
        while (start <= end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
    static char[] words(char[] a){
        int start = 0;
        for (int end = 0; end < a.length; end++) {
            if (a[end] == ' ') {
                reverse(a, start, end);
                start = end + 1;
            }
        }
        reverse(a, start, a.length - 1);
        reverse(a, 0, a.length - 1);
        return a;
    }
    public static void main(String[] args){
        String a = "one two three";
        char[] b = words(a.toCharArray());
        System.out.print(b);
    }
}