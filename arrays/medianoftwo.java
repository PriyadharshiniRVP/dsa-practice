package arrays;

import java.util.Arrays;
import java.util.Scanner;
public class medianoftwo {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nums1 elements:");
        int n=sc.nextInt();
        System.out.println("Enter the number of nums2 elements:");
        int m=sc.nextInt();
        System.out.println("Enter the nums1 elements:");
        int[] nums1=new int[n];  
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("Enter the nums2 elements:");
        int [] nums2=new int[m];
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }

        System.out.println("The median is:"+ findMedianSortedArrays(nums1,nums2));

        
    }

    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=n+m;
        int [] arr=new int[n+m];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
            
        }
        for(int i=0;i<m;i++){
            arr[n+i]=nums2[i];
        }

       Arrays.sort(arr);

        if(k==0){ return 0;}
        if(k%2!=0){ return arr[k/2];}
        else{
            return  (arr[(k/2-1)]+arr[k/2])/2.0;
        }
        
        
    }
}

