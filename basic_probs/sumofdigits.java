package basic_probs;
import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            sum +=n%10; 
            n/=10;
        }
        System.out.println("The sum is:"+sum);
        /* if n=99
        sum = 9
        then n=9
        then sum =9+9 = 18
         */
        
    }
    
}
