import sun.plugin.liveconnect.OriginNotAllowedException;

public class lc_053 {
    public static void main(String[] args) {
//求连续最大子序和***
    }
    static class Solution {
        public int maxSubArray(int[] nums) {
            int ans = nums[0];
            int sum = 0;
            for(int num: nums) {
                if(sum > 0) {
                    sum += num;
                } else {
                    sum = num;
                }
                ans = Math.max(ans, sum);
            }
            return ans;
        }
    }
}
