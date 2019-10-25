//你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
//
// 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。 
//
// 示例 1: 
//
// 输入: [1,2,3,1]
//输出: 4
//解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
//     偷窃到的最高金额 = 1 + 3 = 4 。 
//
// 示例 2: 
//
// 输入: [2,7,9,3,1]
//输出: 12
//解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
//     偷窃到的最高金额 = 2 + 9 + 1 = 12 。
// 
// Related Topics 动态规划

package cn;

public class HouseRobber {
    public static void main(String[] args) {

        Solution solution = new HouseRobber().new Solution();
        int[] a = {1,2,3,1};
        solution.rob(a);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int rob(int[] nums) {
            /**
             * 100
             */
            if(nums.length == 0) return 0;
            if (nums.length == 1) return nums[0];
            if (nums.length == 2) return Math.max(nums[0], nums[1]);
            if (nums.length == 3) return Math.max((nums[0] + nums[2]), nums[1]);
            int i = 3, dp = nums[0], dp1 = nums[1], dp2 = 0, dp3 = nums[2] + nums[0];
            while(i < nums.length){
                dp2 = Math.max(dp, dp1) + nums[i];
                dp = dp1;
                dp1 = dp3;
                dp3 = dp2;
                i++;
            }
            return Math.max(dp1, dp3);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}