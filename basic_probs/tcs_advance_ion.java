package basic_probs;
import java.util.Scanner;

class tcs_advance_ion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int maxSum=arr[0];
        int currentSum=arr[0];
        for(int i=1;i<N;i++){
            if(arr[i]>arr[i-1]){
                currentSum +=arr[i];

            }
            else{
                currentSum=arr[i];
            }
        }
       maxSum=Math.max(currentSum,maxSum);
       System.out.println(maxSum);

    }

}