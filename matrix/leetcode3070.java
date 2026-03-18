import java.util.Scanner;
public class leetcode3070{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int n=sc.nextInt();
        int [][] grid=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
         
        }
        System.out.println(noofsubmatrix(grid, 14));
    
    
    /*   for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(grid[i][j]);
            }
         
        } */ 
        }

        private static int noofsubmatrix(int [][] grid,int k){

            
            return 0;
        }
}