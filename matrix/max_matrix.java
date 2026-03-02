public class max_matrix{
    public static void main(String[] args){
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int max=0;
        
        for(int i=0;i<matrix.length;i++){
            int Currentsum=0;
           
            for(int j=0;j<matrix[i].length;j++){
                 Currentsum += matrix[i][j];
            }
        
         if(Currentsum>max){
                max=Currentsum;

         }
        }
        System.out.println(max);
    }       
}