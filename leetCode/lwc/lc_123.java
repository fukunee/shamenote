package solution2;

/**
 * @author lwc
 * @date 2019/10/30 14:23
 */
public class U123 {
    public int maxProfit(int[] prices) {
        int v1 = 0; int v2 = 0; int cur = 0;
        for(int i = 1; i < prices.length; i++){
            int value = prices[i] - prices[i-1];
            if(value > 0) cur += value;
            else{
               if(v2 <= v1 && v2 < cur) v2 = cur;
               else if(v1 <= v2 && v1 < cur) v1 = cur;
               cur = 0;
            }
        }

        if(cur > v1 || cur > v2) return cur + Math.max(v1,v2);
        else return v1 + v2;
    }
}
