package basic_probs;
import java.util.Scanner;

public class armstrong {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;  
            sum +=digit*digit*digit;
            n/=10;
        }
        System.out.println(temp==sum ? "armstrong":"not a armstrong");
        /* n=153
        temp= 153
        digit=3
        sum =27 ;num=15
        digit= 15%10=5
        sum=27+125=152;num=1
        digit=1;
        sum=152+1;
        sum=153; num=1/10=0.1
        */ 
        
    }
}
