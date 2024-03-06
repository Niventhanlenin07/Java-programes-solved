// Long keyword usages.
class problem26{
    public static void main(String[] args){
        long mynum=10;
        System.out.println(Long.toString(mynum));
        System.out.println(Long.toBinaryString(mynum));
        System.out.println(Long.toHexString(mynum));
        System.out.println(Long.toOctalString(mynum));
        System.out.println(Long.valueOf(mynum));
        System.out.println(Long.rotateLeft(mynum,2));
        System.out.println(Long.rotateRight(mynum,3));
        String n="45";
        Long a=Long.decode(n);
        System.out.println(a);
    }
}