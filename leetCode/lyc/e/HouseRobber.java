package easy;
/*lc_198/*/
public class HouseRobber {
    public static void main(String[] args){
        Solution solution = new HouseRobber().new Solution();
        int[] nums = new int[]{2,7,9,3,1};
        System.out.print(solution.rob(nums));
    }
    class Solution {
        public int rob(int[] nums) {
            if(nums.length < 1){
                return  0;
            }
            if(nums.length == 1){
                return  nums[0];
            }
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0],nums[1]);
            for(int i = 2;i < dp.length;i++){
                dp[i] = Math.max(dp[i - 2] + nums[i],dp[i - 1]);
            }
            return dp[dp.length - 1];
        }
    }
}
