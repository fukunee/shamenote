package solution2;

/**
 * @author lwc
 * @date 2019/10/29 22:32
 */
public class U121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int[] v = new int[prices.length];
        for(int i = 1; i < prices.length; i++){
            v[i] = v[i-1];
            if(prices[i] > v[i-1]){
                for (int j = 0; j < i; j++) {
                    if(prices[i] - prices[j] > v[i])
                        v[i] = prices[i] - prices[j];
                }
            }
        }
        return v[prices.length-1];
    }

    public int maxProfit2(int[] prices){
        int cur = 0,soFar = 0;
        for(int i = 1; i < prices.length; i++){
            cur = Math.max(0,cur += prices[i]-prices[i-1]);
            soFar = Math.max(cur,soFar);
        }
        return soFar;
    }
}
