package hashmap;
import java.util.HashMap;
import java.util.Scanner;
public class firstnonrepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        System.out.println(findnonrepeat(s));

    }
    private static char findnonrepeat (String s){

        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
            

           
        }
        for(char c:s.toCharArray()){
            if(map.get(c)==1){
            return c;
        }
             
        }
        
       


        return '0';

    }

    
}
