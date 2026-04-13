package basic_probs;
import java.util.Scanner;

public class findsecondlarge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>first){
                first=num;
            }    
            
        }
        for(int num:arr){
             if(num!=first && num>second){
                second=num;
            }
        }
        System.out.println("the second large is"+second);
        
    }
    
}
