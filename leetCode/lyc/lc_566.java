class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m=nums.length;
        int n=nums[0].length;
        if(m*n!=r*c){
            return nums;
        }
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int k=(i*c+j)/n;
                int p=(i*c+j)%n;
                res[i][j]=nums[k][p];
            }
        }
        return res;
    }
}