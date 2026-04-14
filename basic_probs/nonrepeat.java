package basic_probs;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;

public class nonrepeat {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
System.out.println(nono(s));}

       
        public static char nono(String s){
        HashMap <Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);

        }
        
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
      return ' ';
    }
    
}
