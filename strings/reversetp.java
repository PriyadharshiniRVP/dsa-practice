package strings;
import java.util.Scanner;
import java.lang.String;

//using two pointer technique

public class reversetp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();

        System.out.println("The Reversed String is:" + reverse(str));
}
public static String reverse (String s){
    if (s ==null) {return null;}

    char[] letters=s.toCharArray();
    int left=0;
    int right=letters.length-1;
    while(left<right){
        char temp=letters[left];
        letters[left]=letters[right];
        letters[right]=temp;
        left ++;
        right--;
    }
return new String(letters);
    
}
    
}
