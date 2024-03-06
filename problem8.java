public class problem8 {
    static void myname(String fname,String lname){ 
    
        System.out.println("It\'s String type."); 
    
        System.out.println(fname+" "+lname); 
    
    }     
    
    static int mynum(int x,int y){ 
    
        System.out.println("It\'s integer type."); 
    
        return x+y; 
    
    } 
    
    public static void main(String[] args) {  
    
        myname("Niventhan","Lenin");    
    
        System.out.println(mynum(5,5)); 
    
    } 
}
