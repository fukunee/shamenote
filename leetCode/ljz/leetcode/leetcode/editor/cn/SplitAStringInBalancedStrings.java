 //1221 贪心
 // 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
//
// 给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。 
//
// 返回可以通过分割得到的平衡字符串的最大数量。 
//
// 
//
// 示例 1： 
//
// 输入：s = "RLRRLLRLRL"
//输出：4
//解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
// 
//
// 示例 2： 
//
// 输入：s = "RLLLLRRRLR"
//输出：3
//解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
// 
//
// 示例 3： 
//
// 输入：s = "LLLLRRRR"
//输出：1
//解释：s 只能保持原样 "LLLLRRRR".
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s[i] = 'L' 或 'R' 
// 
// Related Topics 贪心算法 字符串
  
  package cn;

 import java.util.LinkedList;
 import java.util.List;
 import java.util.Stack;

 public class SplitAStringInBalancedStrings{
      public static void main(String[] args) {
      
           Solution solution = new SplitAStringInBalancedStrings().new Solution();
           String a = "RLRRLLRLRL";
           solution.balancedStringSplit(a);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int balancedStringSplit(String s) {
        //双100
        int n = s.length(), i = 0, j = 0, count = 0;
        if(n == 0) return 0;
        for(; i < n; i++){
            if(s.charAt(i) == 'L') j++;
            else j--;
            if(j == 0) count++;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }