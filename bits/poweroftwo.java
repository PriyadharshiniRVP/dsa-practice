package bits;
import java.util.Scanner;


public class poweroftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("The number is power of 2.");
        }
        else{
            System.out.println("The number is not a power of 2.");
        }
    }

    
}
