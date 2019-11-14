 //学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。 
//
// 请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。 
//
// 
//
// 示例： 
//
// 输入：[1,1,4,2,1,3]
//输出：3
//解释：
//高度为 4、3 和最后一个 1 的学生，没有站在正确的位置。 
//
// 
//
// 提示： 
//
// 
// 1 <= heights.length <= 100 
// 1 <= heights[i] <= 100 
// 
// Related Topics 数组
  
  package cn;

 import java.util.Arrays;

 public class HeightChecker{
      public static void main(String[] args) {
      
           Solution solution = new HeightChecker().new Solution();
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int heightChecker(int[] heights) {
        /**
         * 99%
         */
        int[] a = Arrays.copyOfRange(heights, 0, heights.length);
        int i = 0, diff = 0;
        Arrays.sort(a);
        for(i = 0; i < heights.length; i++)
            if(heights[i] != a[i])
                diff++;
        return diff;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }