package arrays;
import java.util.Scanner;

public class mountaintime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mountain height:");
        int h=sc.nextInt();
        System.out.println("Enter the number of workers:");
        int n=sc.nextInt();
        int t[]=new int[n];
        System.out.println("Enter the worker times");
        for(int i=0;i<n;i++){
            t[i]=sc.nextInt();
        }



    }
    
    public static long mount(int h, int t[]){

       if (t.length == 1) return (long)t[0] * h * (h + 1) / 2;

        long l = 1, r = (long)1e18, ans = r;
        while (l <= r) {
            long mid = l + (r - l) / 2, total = 0;
            for (int wt : t) {
                long x = (long)Math.sqrt(2.0 * mid / wt);
                while ((long)wt * x * (x + 1) / 2 > mid) x--;
                total += x;
                if (total >= h) break;
            }
            if (total >= h) { ans = mid; r = mid - 1; }
            else l = mid + 1;
        }
        return ans;
    }
}
