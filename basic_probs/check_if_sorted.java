package basic_probs;
import java.util.Scanner;

public class check_if_sorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        boolean sorted=true;
        for(int i=0;i<n-1;i++){  /* for 1,3,4 ;i=0; 1<3 ,. so i=1; 3 */
            if(nums[i]>nums[i+1]){
                sorted=false;
             break;
                
            }
            
           
        }
        System.out.println(sorted ? "Sorted":"Not-sortedd");

    }
    
}
