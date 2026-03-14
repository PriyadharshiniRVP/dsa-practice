package strings;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s=sc.nextLine();
        System.out.println("The string is " + isPalindrome(0, s.length()-1, s));
        

        
    }
    private static boolean isPalindrome(int left,int right,String s){
         
         while(left<right){
            if(s.charAt(left) ==s.charAt(right)){
                return true;

            }
            left ++;
            right --;
         }




        return false;
    }
    
}
