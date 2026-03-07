package arrays;
import java.util.Scanner;

class Missing_Number{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println("The Missing Number is:" + findMissing(arr, n));
    }
    public static int findMissing (int [] arr, int n){

        int actualRange=n+1;
        int totalSum = actualRange*(actualRange+1)/2;
        int actualSum =0;
        for(int i=0;i<n;i++){
            actualSum +=  arr[i];
        }
      return totalSum-actualSum;
    }
    
}

