package solution2;

/**
 * @author lwc
 * @date 2019/10/29 22:32
 */
public class U122 {
    public int maxProfit(int[] prices){
        int cur = 0;
        for(int i = 1; i < prices.length; i++){
            int value = prices[i] - prices[i-1];
            if(value > 0) cur = cur + value;
        }
        return cur;
    }
}
