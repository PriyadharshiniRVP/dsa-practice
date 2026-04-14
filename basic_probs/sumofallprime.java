package basic_probs;
import java.util.Scanner;


public class sumofallprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        int sum=0;
        for(int i=0;i<Math.sqrt(n);i++){
            if(nums[i]%i ==0){
                break;
        }
        else{
            sum +=nums[i];
            }
        }
    
        System.out.println(sum);
    }}
    

