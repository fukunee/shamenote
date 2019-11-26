package leetcode;

/**
 * @author lwc
 * @date 2019/11/22 11:44
 */
public class lc_221 {
    public int dp(char[][] matrix){
        if(matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int maxLen = 0;
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        for(int i = 1; i <= matrix.length; i++){
            for(int j = 1; j <= matrix[0].length; j++){
                if(matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    maxLen = Math.max(dp[i][j],maxLen);
                }
            }
        }
        return maxLen*maxLen;
    }





    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int max = 0;
        int xLen = matrix.length - 1;
        int yLen = matrix[0].length - 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == '1') {
                    max = Math.max(max, 1);
                    int len = Math.min(xLen - i, yLen - j);
                    for (int k = 1; k <= len; k++) {
                        int value = isSquare(i, j, k, matrix);
                        if (value == -1) break;
                        max = Math.max(max, value);
                    }
                }
            }
        }
        return max;
    }

    public int isSquare(int x,int y,int len,char[][] matrix){
        for(int i = x; i <= x + len; i++){
            for(int j = y; j <= y + len; j++){
                if(matrix[i][j] == '0') return -1;
            }
        }
        return (len + 1) * (len + 1);
    }

}
