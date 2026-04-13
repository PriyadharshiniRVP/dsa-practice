package basic_probs;
import java.util.Scanner;
public class reverse_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();    
        int rev=0;
        while(num >0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println("The reversed number is :"+rev);
    }
    /* if n=12;
    rev=0;
     rev=0+2
     rev=2;
     num=1
     then :
     rev=20+1
     rev=21*/
                                     
}
