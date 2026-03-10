package arrays;
import java.util.Scanner;
import java.util.Arrays;

class median{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        System.out.println("Enter the elements one by one:");
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
       System.out.println("The median is:" +findmedian(nums));
    }

    private static double findmedian(int [] nums){ /// the median can be double too
        Arrays.sort(nums);
        int n=nums.length-1;
        if(n==0){ return 0;}
        if(n%2!=0){ return nums[n/2];}
        else{
            return  (nums[(n/2-1)]+nums[n/2])/2.0;
        }
        

    }


}
