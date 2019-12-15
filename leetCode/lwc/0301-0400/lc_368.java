package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/11 21:52
 */
public class lc_368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int len = nums.length;
        if (len < 1) return new ArrayList<>();
        Arrays.sort(nums);
        int[] dp = new int[len];
        int[] pre = new int[len];
        for(int i = 0; i < len; i++){
            dp[i] = 1;
            pre[i] = i;
        }

        int k = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] + 1 > dp[i] && nums[i] % nums[j] == 0) {
                    dp[i] += 1;
                    pre[i] = j;
                }
            }
            if(dp[i] > dp[k]) k = i;
        }

        LinkedList<Integer> rs = new LinkedList<>();
        while(pre[k] != k){
            rs.addFirst(nums[k]);
            k = pre[k];
        }
        rs.addFirst(nums[pre[k]]);
        return rs;
    }
}
