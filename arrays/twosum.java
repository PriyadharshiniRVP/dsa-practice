package arrays;

import java.util.HashMap;

public class twosum {
    public static void main(String[] args){
        int nums[]={9,7,6,5,14};
        int target=14;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                System.out.println(map.get(complement)+","+i);

            }
            map.put(nums[i],i);
    }
    
}
}