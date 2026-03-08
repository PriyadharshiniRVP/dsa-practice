package hashmap;
import java.util.HashMap;
import java.util.Scanner;

public class countvowel_dev {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Word:");
        String word=sc.nextLine();
        String Vowels="aeiou";
        word=word.toLowerCase();
        HashMap<Character,Integer> count=new HashMap<>();
        for(char c:word.toCharArray()){
            if(Vowels.indexOf(c) !=-1){
                count.put(c, count.getOrDefault(c,0)+1);

            }
        }
       System.out.println("the count is:" +count);

    }
    
}
