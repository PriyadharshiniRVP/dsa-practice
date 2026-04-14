package basic_probs;
import java.util.Scanner;
class find_square{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int squareSum=0;
        for(int i=0;i<n;i++){
            if(isSquare(nums[i])){
                squareSum+=nums[i];
            }
        }
        System.out.println(squareSum);
    }
    public static boolean isSquare(int num){
       boolean  square=false;
       int sqrt=(int) Math.sqrt(num);
       if(sqrt*sqrt==num){
           square=true;
           
       }
       return square;
    }
}