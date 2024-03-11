class problem88 {
    public static void main(String[] args){
        String str = "Hi hello everyone";
        String strArray[] = str.split(" ");
        System.out.println("String : " + str);
        System.out.println("[ ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
        System.out.print("]");
    }
}