package hashmap;
import java.util.HashMap;
import java.util.Scanner;

public class countvowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word:");
        String word=sc.nextLine();
       


        
    HashMap<Character,Integer> count=new HashMap<>() ;


    for(char c:word.toCharArray()){
        if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u'){
        count.put(c,count.getOrDefault(c,0)+1);
        }
        
    }
    System.out.println("The count is:"+ count) ;


        
    
}
}
