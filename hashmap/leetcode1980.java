/*. Find Unique Binary String
Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n 
that does not appear in nums. If there are multiple answers, you may return any of them.

Example 1:

Input: nums = ["01","10"]
Output: "11"
Explanation: "11" does not appear in nums. "00" would also be correct.
Example 2:

Input: nums = ["00","01"]
Output: "11"
Explanation: "11" does not appear in nums. "10" would also be correct.
Example 3:

Input: nums = ["111","011","001"]
Output: "101"
Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct. */



package hashmap;



public class leetcode1980 {
    public static void main(String[] args) {
        String [] nums={"01","10"};
        System.out.println("The unique String is:"+ findunique(nums));
        
    }
    public static String findunique(String[] arr){
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<arr.length;i++){
        char c=arr[i].charAt(i);
        sb.append(c=='1' ? '0':'1');

       }
      
       return sb.toString();
    }
}
