package basic_probs;
import java.util.Scanner;

public class removespace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll(" ","");
        System.out.println(s);
    }
    
}
