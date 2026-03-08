package arrays;

import java.util.Scanner;

public class max_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int [] nums=new int[n];
        System.out.println("Enter the elements one by one:");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
      System.out.println("The maximum element is:" + large(n, nums));
        
    }

    private static int large(int n, int[] arr){
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        

        return max;
    }
}

    
