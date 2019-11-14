//22
// 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
//
// 例如，给出 n = 3，生成结果为： 
//
// [
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]
// 
// Related Topics 字符串 回溯算法

package cn;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {

        Solution solution = new GenerateParentheses().new Solution();
        System.out.println(solution.generateParenthesis(3));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<String> ret = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        public List<String> generateParenthesis(int n) {
            /**
             * 99%
             */
            dfs(n, n);
            return ret;
        }

        private void dfs(int left, int right) {
            if(count < 0) return;
            if (left == 0 && right == 0) {
                ret.add(new String(sb));
                return;
            }
            if(left > 0){
                sb.append('(');
                count++;
                dfs(left-1, right);
                sb.deleteCharAt(sb.length()-1);
                count--;
            }
            if(right > 0){
                sb.append(')');
                count--;
                dfs(left, right-1);
                sb.deleteCharAt(sb.length()-1);
                count++;
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}