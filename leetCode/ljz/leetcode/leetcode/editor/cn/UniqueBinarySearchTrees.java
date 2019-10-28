//给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
//
// 示例: 
//
// 输入: 3
//输出: 5
//解释:
//给定 n = 3, 一共有 5 种不同结构的二叉搜索树:
//
//   1         3     3      2      1
//    \       /     /      / \      \
//     3     2     1      1   3      2
//    /     /       \                 \
//   2     1         2                 3 
// Related Topics 树 动态规划

package cn;

public class UniqueBinarySearchTrees {
    public static void main(String[] args) {

        Solution solution = new UniqueBinarySearchTrees().new Solution();
        solution.numTrees(7);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int numTrees(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            if (n == 2) return 2;
            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;
            int i = 3, j = 0;
            for (; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    dp[i] += dp[i - j] * dp[j - 1];
                }
                System.out.print(" "+dp[i]);
            }
            return dp[n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}