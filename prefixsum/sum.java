package prefixsum;

import java.util.ArrayList;

public class sum {
    public static void main(String[] args) {
        int[] arr={3,4,5,6};
        System.out.println(prefsum(arr));
        
    }

    private static ArrayList<Integer> prefsum(int[] arr){
        int n=arr.length;
       ArrayList<Integer> prefixsum=new ArrayList<>();
       prefixsum.add(arr[0]);
       for(int i=1;i<n;i++){
        prefixsum.add(prefixsum.get(i-1)+arr[i]);

       }
       return  prefixsum;
    }
    
}
