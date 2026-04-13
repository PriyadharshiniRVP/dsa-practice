package basic_probs;
import java.util.Scanner;

public class removechar {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    char ch=sc.next().charAt(0);
    StringBuilder  sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=ch){
            sb.append(s.charAt(i));
        }
    }
System.out.println(sb.toString());
    }

}
