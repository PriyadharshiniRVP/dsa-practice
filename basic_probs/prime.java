package basic_probs;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean prime=true;
        if(num<=1){ prime =false; }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }
        System.out.println(prime ? "Prime":"NotPrime");
    }

    
}
