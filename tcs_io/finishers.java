package tcs_io;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Problem Restatement: Marathon Distances
Background
A marathon has an official distance of 42.195 km (finishing distance). Participants who cover more than 0.0 km get recorded in the array.

Input
A float array R[] containing distances covered by N participants (in kilometers)

Condition
Finishers = participants who covered exactly 42.195 km

Non-finishers = participants who covered any distance other than 42.195 km (but > 0.0 km)

Task
Find the top 3 maximum distances from the non-finishers only.

Edge Cases to Handle
If there are 3 or more non-finishers → return the top 3 distances

If there are only 2 non-finishers → return those 2 distances

If there is only 1 non-finisher → return that 1 distance

If there are 0 non-finishers → (you need to decide what to return)

Example (for understanding)
text
Input R[] = [42.195, 40.2, 38.7, 42.195, 35.5, 41.0, 42.195]

Non-finishers: 40.2, 38.7, 35.5, 41.0

Top 3: 41.0, 40.2, 38.7 */

public class finishers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        
        
        
        float R[] =new float[n];
        for(int i=0;i<n;i++){
            R[i]=sc.nextFloat();
            
        }
          
      
    
      ArrayList<Float> nf=new ArrayList<>();

      for(int i=0;i<n;i++){
        if(R[i]!=42.195f){
            nf.add(R[i]);
        }

      }  
      Collections.sort(nf,Collections.reverseOrder());
      
     
   /*to print the top 3 or top few */
   int limit=Math.min(3,nf.size());
   for(int i=0;i<limit;i++){
    System.out.print(nf.get(i)+" ");
   }

       
    }
    
}
