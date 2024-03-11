class problem95{
    public static boolean palindrome(String str){
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args){
        String str = "nine";
        str = str.toLowerCase();
        boolean A = palindrome(str);
        System.out.println(A);
    }
}