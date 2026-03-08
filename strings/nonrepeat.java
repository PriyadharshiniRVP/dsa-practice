package strings;
import java.util.HashMap;
import java.util.Scanner;

//using hashmap


public class nonrepeat {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word:");
        String Str=sc.nextLine();
        System.out.println("The Non-Repeated Letter is:" +findnonrepeat(Str) );


    }

    public static char findnonrepeat(String s){
        HashMap<Character,Integer> count=new HashMap<>();
        for(char c: s.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(count.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return 0;

    }
}
