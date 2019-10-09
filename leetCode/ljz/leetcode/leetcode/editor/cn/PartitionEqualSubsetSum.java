 //给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。 
//
// 注意: 
//
// 
// 每个数组中的元素不会超过 100 
// 数组的大小不会超过 200 
// 
//
// 示例 1: 
//
// 输入: [1, 5, 11, 5]
//
//输出: true
//
//解释: 数组可以分割成 [1, 5, 5] 和 [11].
// 
//
// 
//
// 示例 2: 
//
// 输入: [1, 2, 3, 5]
//
//输出: false
//
//解释: 数组不能分割成两个元素和相等的子集.
// 
//
// 
// Related Topics 动态规划
  
  package cn;

 import java.util.Arrays;

 public class PartitionEqualSubsetSum{
      public static void main(String[] args) {
      
           Solution solution = new PartitionEqualSubsetSum().new Solution();
           int[] a = {1, 2, 11, 5};
           boolean b = solution.canPartition(a);
           if(b)
                System.out.println("1");
           else
               System.out.println("2");
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        if(n == 1 || n == 0) return false;
        int i = 0, j = 0;
        for(; i < n ; i++)
            j += nums[i];
        if(j % 2 != 0) return false;
        j = j / 2;
        boolean[] ret = new boolean[j+1];
        ret[0] = true;
        for(Integer num : nums)
            for(i = j; i >= num; i--)
                ret[i] = ret[i] || ret[i-num];
         return ret[j];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }