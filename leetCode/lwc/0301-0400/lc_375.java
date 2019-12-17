package leetcode;

/**
 * @author lwc
 * @date 2019/12/13 10:57
 */
public class lc_375 {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+2][n+2];
        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                if(j + i <= n) {
                    int res = Integer.MAX_VALUE;
                    //此处是dp的进一步优化k = j表示从j开始，但是我们发现k从中间开始是最大最小值的充分条件
                    for (int k = (2*j+i)/2; k <= j + i; k++) {
                        res = Math.min(res, k + Math.max(dp[j][k - 1], dp[k + 1][j + i]));
                    }
                    dp[j][j+i] = res;
                }
            }
        }
        return dp[1][n];
    }
}
