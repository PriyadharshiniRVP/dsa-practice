package hashmap;
import java.util.HashSet;
import java.util.Scanner;

public class longestnonrepeat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        System.out.println("The longest Repeating substring's length is:"+ longnon(s));
}
private static int longnon(String s){
    int maxLen=0;
    int left =0;
    HashSet <Character> set=new HashSet<>();
    for(int right=0;right<s.length();right++){
        while(set.contains(s.charAt(right))){
            set.remove(s.charAt(left));
            left++;
        }
       set.add(s.charAt(right));
        maxLen=Math.max(maxLen,right-left+1);

    }
   return maxLen;

}
    
}
