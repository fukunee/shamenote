package leetcode;

/**
 * @author lwc
 * @date 2019/11/28 22:39
 */
public class lc_309 {
    public int maxProfit(int[] prices) {
        int a = 0, b = Integer.MIN_VALUE;
        int c = 0, d = 0;
        for(int i = 0; i < prices.length; i++){
            a = Math.max(a, b + prices[i]);
            if(i % 2 == 0){
                b = Math.max(b, c - prices[i]);
                c = a;
            }
            else{
                b = Math.max(b, d - prices[i]);
                d = a;
            }
        }
        return Math.max(c, d);
    }

    public int maxProfit2(int[] prices) {
        int a = 0, b = Integer.MIN_VALUE;
        int c = 0;
        int temp;
        for(int i = 0; i < prices.length; i++){
            temp = a;
            a = Math.max(a, b + prices[i]);
            b = Math.max(b, c - prices[i]);
            c = temp;
        }
        return a;
    }
}
