package arrays;
import java.util.Scanner;

public class minsizesubarraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Enter the Elements one by one:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("The minimum Length of subarray is:"+findminlensubarray(nums, 8));
        
    }
    private static int findminlensubarray(int[] arr,int target){
        int minLen=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[left]+arr[right] == target){
               left++;

            }
            minLen=Math.min(minLen, right-left+1);
        }
        return minLen;

    }
    
}
