//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
// 示例: 
//
// 输入: [-2,1,-3,4,-1,2,1,-5,4],
//输出: 6
//解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
// 
//
// 进阶: 
//
// 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。 
// Related Topics 数组 分治算法 动态规划

package cn;

public class MaximumSubarray {
    public static void main(String[] args) {

        Solution solution = new MaximumSubarray().new Solution();
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print(solution.maxSubArray(a));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxSubArray(int[] nums) {
            /**
             * 67%，想不出好的方法了，看看题解   对判断的地方进行了优化尝试修改,同时不用一个数组
             * 来保存之前的结果
             */
            /*
            if (nums.length == 1) return nums[0];
            int[] dp = new int[nums.length + 1];
            int j = 0, max = -999;
            dp[0] = 0;
            for (int i = 1; i <= nums.length; i++, j++) {
                if ((nums[j] >= 0 && dp[j] <= 0) || (nums[j] < 0 && dp[j] < 0)) dp[i] = Math.max(nums[j], dp[j]);
                else if((nums[j] >= 0 && dp[j] > 0) || (nums[j] < 0 && dp[j] >= 0 && i != nums.length)) dp[i] = dp[j] + nums[j];
                else dp[i] = dp[j];
                if(dp[i] > max) max = dp[i];
            }
            return max;

             */
            /**
             * 99%
             */
            if (nums.length == 1) return nums[0];
            int max = -999, sum = 0;
            sum = nums[0];
            max = sum;
            for (int i = 1; i < nums.length; i++) {
                if(sum > 0) sum += nums[i];
                else if(sum <= 0) sum = nums[i];
                if(sum > max) max = sum;
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}