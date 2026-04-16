package basic_probs;
import java.util.Scanner;

public class countwords {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.isEmpty()){System.out.print(0);}
        else{
            String[] words=s.split("\\s+");
            System.out.println(words.length);
        }
    }
}
