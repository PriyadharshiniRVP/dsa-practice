/* 1582. Special Positions in a Binary Matrix
Given an m x n binary matrix mat, return the number of special positions in mat.
A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

*/






class Solution {
    public int numSpecial(int[][] mat) {
           int rows=mat.length;
           int cols=mat[0].length;

           int[] rowsCount = new int[rows];
           int[] colsCount = new int[cols];

           for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==1){
                    rowsCount[i]++;
                    colsCount[j]++;
                }

            }
           }

           int specialPositions = 0;
           for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==1){
                if(rowsCount[i]==1 && colsCount[j]==1){
                    specialPositions++;
                }
            }
           }}

           return specialPositions;
        
    }
}
