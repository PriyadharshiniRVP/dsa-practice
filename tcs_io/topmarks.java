package tcs_io;
import java.util.ArrayList;
/*Problem: Student Grading Filter
Background
A school has conducted exams for N students. Each student scored a certain percentage. The passing marks are 40.0%. Students who scored exactly 40.0% are considered "borderline" and are excluded from the merit list.

Input
First line: Integer N (number of students)

Next N lines: Float values representing each student's percentage

Task
Find the top 2 highest scores from students who are NOT borderline (i.e., score ≠ 40.0%)

Edge Cases to Handle
If there are 2 or more non-borderline students → return top 2 scores

If there is only 1 non-borderline student → return that 1 score

If there are 0 non-borderline students → return nothing (blank output)

Example
Input:

text
6
40.0
85.5
40.0
72.3
91.0
67.8
Non-borderline students: 85.5, 72.3, 91.0, 67.8

Top 2: 91.0, 85.5

Output:

text
91.0 85.5
Another Example (Edge Case)
Input:

text
3
40.0
40.0
40.0
Non-borderline students: None

Output:

text
(blank - nothing printed)
 */
import java.util.Scanner;
import java.util.Collections;
public class topmarks {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float[] M=new float[n];
        for(int i=0;i<n;i++){
            M[i]=sc.nextFloat();
        }
        ArrayList<Float> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(M[i] !=40.0f){
                list.add(M[i]);

            }
        }
        Collections.sort(list,Collections.reverseOrder());
        int limit=Math.min(2,list.size());
        for(int i=0;i<limit;i++){
            System.out.print(list.get(i)+" ");

        }
    }
    
}
