

package sliding_window;
import java.util.Scanner;
class subarraywindowhard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First string:");
        String s= sc.nextLine();
        System.out.println("Enter the Second string:");
        String t=sc.nextLine();
        sc.close();
        System.out.println(minWindow(s, t));

        
    }
    public static String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return " ";
        }
        StringBuilder str=new StringBuilder();
        
        for(char c:s.toCharArray()){
          
            
        }
        return "2";
        
    }
}