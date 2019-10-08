 //给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 示例 1: 
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
// 
//
// 示例 2: 
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
// 
// Related Topics 数组
  
  package cn;
  public class PlusOne{
      public static void main(String[] args) {
      
           Solution solution = new PlusOne().new Solution();
           int[] nums = {1};
           solution.plusOne(nums);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i = n - 2;
        int ret[] = new int[n + 1];
        int ret1[] = new int[n];
        if(digits[n-1] != 9){
            digits[n-1] = digits[n-1]+1;
            return digits;
        }
        while(i >= 0 &&digits[i] == 9) i--;
        if(i == -1){
            ret[0] = 1;
            return ret;
        }
        ret1[i] = digits[i]+1;
        for(i--; i >= 0; i--){
            ret1[i] = digits[i];
        }
        return ret1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }