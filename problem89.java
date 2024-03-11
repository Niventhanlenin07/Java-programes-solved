import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 class problem88{
    public static String[] convert(Set<String> setOfString){
        String[] arrayOfString=setOfString.toArray(new String[0]);
        return arrayOfString;
    }
    public static void main(String[] args){
        String str = "Hi hello everyone";
        Set<String> string = new HashSet<>(Arrays.asList(str));
        System.out.println("String: " + str);
        String[] string_array = convert(string);
        System.out.println(Arrays.toString(string_array));
    }
}
