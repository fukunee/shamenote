//给定一个二进制数组， 计算其中最大连续1的个数。
//
// 示例 1: 
//
// 
//输入: [1,1,0,1,1,1]
//输出: 3
//解释: 开头的两位和最后的三位都是连续1，所以最大连续1的个数是 3.
// 
//
// 注意： 
//
// 
// 输入的数组只包含 0 和1。 
// 输入数组的长度是正整数，且不超过 10,000。 
// 
// Related Topics 数组

package cn;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        Solution solution = new MaxConsecutiveOnes().new Solution();
        int[] a = {1,0,1,1,0,1};
        solution.findMaxConsecutiveOnes(a);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int i = 0, j = 0, max = 0;
            for(; i < nums.length; i++){
                if(nums[i] == 0) j = 0;
                else{
                    j++;
                    if(j > max) max = j;
                }
            }
            System.out.print(max);
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}