package basic_probs;
import java.util.Scanner;

public class movezero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ind=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[ind++]=nums[i];
            }
        }
        while(ind<n){
            nums[ind++]=0;
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
    
}
