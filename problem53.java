class problem53{
    public static void main(String[] args){
        String letters="b3c6d5";
        for (int i=0;i<letters.length();i++){
            if(Character.isAlphabetic(letters.charAt(i))){
                System.out.print(letters.charAt(i));
            }else{
                int x=Character.getNumericValue(letters.charAt(i));
                for(int j=1;j<x;j++){
                    System.out.print(letters.charAt(i-1));
                }
            }
        }
    }
} 