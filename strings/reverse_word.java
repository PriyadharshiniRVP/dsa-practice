package strings;
import java.util.Scanner;


public class reverse_word {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Sentence:");
    String sentence=sc.nextLine();
    sc.close();
    System.out.println("Reversed Sentence: "+ reverse(sentence));
    }
    public static String reverse (String s){
        String trimmed=s.trim();  // removes the spaces 
        if(trimmed.isEmpty()){
            System.out.println("Reversed Sentence is:");
            return null ;
         }
         String[] words=trimmed.split("\\s+"); // spliting it 
         StringBuilder reversedSentence=new StringBuilder();
         for(int i=words.length-1;i>=0;i--){
            reversedSentence.append(words[i]); //appending it

            if(i!=0){
                reversedSentence.append("");
            }
         }
        return reversedSentence.toString();
    }

    
}
