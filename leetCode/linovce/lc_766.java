class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int t = matrix[i][0];
            int a=i+1,b=1;
            
            while(a<matrix.length&&b<matrix[0].length){
                if(matrix[a][b]!=t)
                    return false;
                a++;
                b++;
            }
            
        }
        
        for(int i=matrix[0].length-1;i>=1;i--){
            int t = matrix[0][i];
            int a=1,b=i+1;
            
            while(a<matrix.length&&b<matrix[0].length){
                if(matrix[a][b]!=t)
                    return false;
                a++;
                b++;
            }
            
        }
        
        return true;
    }
}