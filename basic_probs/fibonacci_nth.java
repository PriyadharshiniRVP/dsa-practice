package basic_probs;
import java.util.Scanner;

public class fibonacci_nth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=sc.nextInt();
        if(r==1){
            System.out.println(a);
        }
        if(r==2){
            System.out.println(b);

        }
        else{
            int first=a;
            int second=b;
            int third=0;
        for(int i=3;i<=r;i++){
           
             third=first+second;
            first=second;
            second=third;
        }
        System.out.println(third);
    }
    }

    
}
