package basic_probs;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(b!=0){
            int temp=b;  
            b=a%b;   
            a=temp;

            
        }
        System.out.println(a);
        /* gcd pf 4 and 6
        first: temp=6
        b=4%6=4; a=6

        temp=4
        b=6%4 =2
        a=4
        
        temp=2
        b=4%2=0;
        a=2;
        since b=0; loop ends.*/
        /* gcd of 45 and 15
        temp=15
        b=45%15=0
        a=15
        
        loop ends here.*/


        /* gcd of 12 and 18
        temp=18
        b=12%18=6
        a=18
        
        temp=6
        b=18%6 ==0
        a=6 : loop ends here

        */
       
    }
    
}
