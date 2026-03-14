package strings;
import java.util.Scanner;

public class long_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine();
        int start=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            int len1=longpal(s, i, i);
            int len2=longpal(s,i,i+1);

            int len=Math.max(len1,len2);

            if(len>maxlen){
                maxlen=len;
                start = i - (len - 1) / 2;

            }
        }
        System.out.println( s.substring(start, start + maxlen));
        
    }

    private static int longpal(String s,int left ,int right){
        StringBuilder sb=new StringBuilder();
        while(left>=0 && right<s.length() &&
            (s.charAt(left)==s.charAt(right))){
                
        
            left --;
            right++;
            
        
            }

        return  right-left-1;
    
    
}

}
