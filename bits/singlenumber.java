package bits;
import java.util.Scanner;
public class singlenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter the Elements:");
        int [] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("The unique number is:" +single(nums));
    }
    public static int single(int [] nums){
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans ^= nums[i];

        }
        return ans;
    }
    
}
