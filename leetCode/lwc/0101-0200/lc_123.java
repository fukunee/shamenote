package leetcode;

/**
 * @author lwc
 * @date 2019/12/1 14:55
 */
public class lc_123 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][][] v = new int[n][3][2];
        for (int i = 0; i < n; i++) {
            for (int j = 1; j >= 0; j--) {
                if(i - 1 == -1){
                    v[0][j][1] = -prices[0];
                    v[0][j][0] = 0;
                } else {
                    v[i][j][1] = Math.max(v[i - 1][j + 1][0] - prices[i], v[i - 1][j][1]);
                    v[i][j][0] = Math.max(v[i - 1][j][1] + prices[i], v[i - 1][j][0]);
                }
            }
        }
        return n > 0 ? v[n - 1][0][0] : 0;
    }

    public int maxProfit2(int[] prices) {
        int v_1_0 = 0, v_1_1 = Integer.MIN_VALUE;
        int v_2_0 = 0, v_2_1 = Integer.MIN_VALUE;
        for (int price : prices) {
            v_1_0 = Math.max(v_1_1 + price,v_1_0);
            v_1_1 = Math.max(v_2_0 - price, v_1_1);
            v_2_0 = Math.max(v_2_0, v_2_1 + price);
            v_2_1 = Math.max(-price, v_2_1);
        }
        return v_1_0;
    }
}
