import java.util.Arrays;
public class problem10 { 
    static void sort_list(int list[],int n){ 

        Arrays.sort(list); 

        int i=0,j=n-1; 

        while(i<j){ 

            System.out.print(list[j--]+" "); 

            System.out.print(list[i++]+" "); 

        } 

        if(n%2 !=0){ 

            System.out.print(list[i]); 

        } 

    } 

    public static void main(String[] args) {  

        int list[]={1,2,3,4,5,6,7}; 

        int n=list.length; 

        sort_list(list,n); 

    } 

} 