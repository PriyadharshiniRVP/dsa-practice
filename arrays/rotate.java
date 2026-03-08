package arrays;
import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int k=2;
        int [] nums=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        reverse(nums,0,n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        System.out.println("The Rotated Array is:" );
        for(int i=0;i<n;i++){
        
        System.out.print(nums[i] + " ");    
    }


        
    }
    

    private static  void reverse(int [] nums, int left, int right){
        
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right --;


        }
    }
}
