package leetcode;

import java.util.PriorityQueue;

/**
 * @author lwc
 * @date 2019/11/26 20:48
 */
public class lc_264 {
    public int nthUglyNumber(int n) {
        int pos = 0; long cur = 0;
        PriorityQueue<Long> queue = new PriorityQueue();
        queue.offer((long)1);
        while(pos < n){
            if(cur == queue.peek())
                queue.poll();
            else {
                cur = queue.poll();
                queue.offer(cur * 2);
                queue.offer(cur * 3);
                queue.offer(cur * 5);
                pos++;
            }
        }
        return (int)cur;
    }

    public int nthUglyNumber2(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int min = Math.min(dp[i2] * 2, Math.min(dp[i3] * 3, dp[i5] * 5));
            if (min == dp[i2] * 2) i2++;
            if (min == dp[i3] * 3) i3++;
            if (min == dp[i5] * 5) i5++;
            dp[i] = min;
        }

        return dp[n - 1];
    }
}
