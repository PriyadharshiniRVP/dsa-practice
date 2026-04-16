package basic_probs;
import java.util.Scanner;

public class matrix_add {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int totalSum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                totalSum+=mat[i][j];

            }
        }
        System.out.println(totalSum);
    }
    
}
