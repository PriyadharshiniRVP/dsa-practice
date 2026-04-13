package basic_probs;
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=a, y=b;     
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        int gcd=x;
        int lcm= a*b/gcd;
        System.out.println(lcm);
        /*gcd of 4 and 6 is 2
        so , a*b= 4*6=24, 24/2=12 */
        /* gcd of 45 and 15 are 15
        lcm= 45*15/15 = 45 */
    }
    
}
