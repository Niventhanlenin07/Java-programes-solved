import java.util.Arrays;
class problem92{
    public static void main(String[] args){
        int n = 4;
        String names[]= { "Anbu", "Ajay", "Anuj", "Aariya" };
        Arrays.sort(names);
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}