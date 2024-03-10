import java.util.*;
public class problem61{ 
    public static void main(String[] args) { 
        ArrayList<Integer> a = new ArrayList<Integer>(); 
        a.add(4); 
        a.add(2); 
        a.add(1); 
        a.add(9); 
        a.add(7); 
        Collections.sort(a, Collections.reverseOrder()); 
        System.out.println(a); 
    } 
}