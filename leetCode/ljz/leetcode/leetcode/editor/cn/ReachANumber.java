 //在一根无限长的数轴上，你站在0的位置。终点在target的位置。 
//
// 每次你可以选择向左或向右移动。第 n 次移动（从 1 开始），可以走 n 步。 
//
// 返回到达终点需要的最小移动次数。 
//
// 示例 1: 
//
// 
//输入: target = 3
//输出: 2
//解释:
//第一次移动，从 0 到 1 。
//第二次移动，从 1 到 3 。
// 
//
// 示例 2: 
//
// 
//输入: target = 2
//输出: 3
//解释:
//第一次移动，从 0 到 1 。
//第二次移动，从 1 到 -1 。
//第三次移动，从 -1 到 2 。
// 
//
// 注意: 
//
// 
// target是在[-10^9, 10^9]范围中的非零整数。 
// 
// Related Topics 数学
  
  package cn;
  public class ReachANumber{
      public static void main(String[] args) {
      
           Solution solution = new ReachANumber().new Solution();
           System.out.print(solution.reachNumber(3));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reachNumber(int target) {
        if(target == 0) return 0;
        if(target < 0) target = ~target + 1;
        int i = 1, j = 0;
        for(; j < target || (j - target) % 2 != 0; ){
            j += i;
            i++;
        }
        return i-1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }