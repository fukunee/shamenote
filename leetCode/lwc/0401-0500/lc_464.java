package leetcode;

/**
 * @author lwc
 * @date 2020/3/9 17:32
 */
public class lc_464 {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int canReachTotal = (1 + maxChoosableInteger) * maxChoosableInteger / 2;
        //如果这些数的总和都不能达到目的值，显然是不会赢的
        if(canReachTotal < desiredTotal) return false;
        if(canReachTotal == desiredTotal) return (maxChoosableInteger & 1) == 1;

        return canWin(0, desiredTotal, maxChoosableInteger, new int[1 << maxChoosableInteger]);
    }

    private boolean canWin(int stat, int desiredTotal, int maxChoosableInteger, int[] dp){
        if(dp[stat] != 0) return dp[stat] == 1;

        boolean result = false;
        for(int i = maxChoosableInteger; i > 0; i--){
            int cur = 1 << (i - 1);
            if((stat & cur) != 0) continue;
            if(i >= desiredTotal || !canWin(stat | cur, desiredTotal - i, maxChoosableInteger, dp)){
                result = true;
                break;
            }
        }
        dp[stat] = result ? 1 : 2;
        return result;
    }
}
