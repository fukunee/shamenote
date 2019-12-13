package leetcode;

import javafx.util.Pair;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/12/3 9:51
 */
public class lc_322 {
    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;

        int[] dp = new int[amount + 1];
        for(int i = 0; i < amount + 1; i++){
            if(i == 0 || dp[i] != 0){
                for(int coin : coins){
                    if(i <= amount - coin){
                        dp[i+coin] = dp[i+coin] == 0 ? dp[i]+1 : Math.min(dp[i]+1, dp[i+coin]);
                    }
                }
            }
        }
        return dp[amount] > 0 ? dp[amount] : -1;
    }

}
