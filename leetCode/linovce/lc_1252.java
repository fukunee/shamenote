class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] A = new int[n][m];

        for(int i=0;i<indices.length;i++){
            for(int j=0;j<m;j++){
                A[indices[i][0]][j]++;
            }
            for(int j=0;j<n;j++){
                A[j][indices[i][1]]++;
            }
        }
        int num=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(A[i][j]%2==1)
                    num++;
            }
        }
        return num;
    }
}