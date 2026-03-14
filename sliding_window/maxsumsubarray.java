package sliding_window;

public class maxsumsubarray {
     // maja problem solved it during the bny  preparation
     //this is a type of greedy too 

    public static void main(String[] args) {
        int[] arr={1,2,3,4,-5,-7};
        System.out.println("The maximum sum subarray is:"+ findmaxsum(arr));

        
    }
    private static int findmaxsum(int [] nums){

        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]); //current input 
            maxSum=Math.max(maxSum,currentSum); //next step checking
        }
        return maxSum;

        
    }
    
}
