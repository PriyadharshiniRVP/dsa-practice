package strings;
import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuilder;

// using the stringbuilder

public class reversesb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();

        System.out.println("The Reversed String is:" +  reverse_word(s));

}

public static String reverse_word(String s){
    if (s==null) {return null;} //edge case 
    StringBuilder reversed = new StringBuilder();
    for(int i=s.length()-1;i>=0;i--){
        reversed.append(s.charAt(i));
    }


    
    return reversed.toString();
}
    
}
