package basic_probs;
import java.util.Scanner;

public class fibonacci_nth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=sc.nextInt();
        for(int i=a;i<=r;i++){
            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;
        }
    }

    
}
