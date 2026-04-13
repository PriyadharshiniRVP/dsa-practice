package basic_probs;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0; int b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" "); // int n=4; a=0;b=1
                                  // int i=1; c=0+1 =1 ; a=1;b=1 ..int i=2; c= 1+2 ;

            int c=a+b;
            a=b;
            b=c;
        }
        
        
    }
    
}
