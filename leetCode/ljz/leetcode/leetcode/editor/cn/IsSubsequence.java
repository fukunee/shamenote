//给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
//
// 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。 
//
// 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。 
//
// 示例 1: 
//s = "abc", t = "ahbgdc" 
//
// 返回 true. 
//
// 示例 2: 
//s = "axc", t = "ahbgdc" 
//
// 返回 false. 
//
// 后续挑战 : 
//
// 如果有大量输入的 S，称作S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？ 
//
// 致谢: 
//
// 特别感谢 @pbrother 添加此问题并且创建所有测试用例。 
// Related Topics 贪心算法 二分查找 动态规划

package cn;

public class IsSubsequence {
    public static void main(String[] args) {

        Solution solution = new IsSubsequence().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public boolean isSubsequence(String s, String t) {
            //s短，t长
            /**
             * 递归20%，尝试使用迭代
             */
        /*
        if(s == null) return true;
        int i = s.length()-1, j = t.length()-1;
        return is(s, i, t, j);
    }

    public boolean is(String s, int i, String t, int j){
        if(i == -1) return true;
        else if(j == -1) return false;
        if(s.charAt(i) == t.charAt(j)) return is(s, i-1, t, j-1);
        else return is(s, i, t, j-1);
    }
    }
         */
            /**
             * 佛了，迭代也只有65%，尝试其他解法
             */
            /*
            if (s == null) return true;
            int i = s.length() - 1, j = t.length() - 1;
            while (i >= 0 && j >= 0) {
                if (s.charAt(i) == t.charAt(j)) {
                    i--;
                    j--;
                } else j--;
            }
            if(i == -1) return true;
            return false;

             */
            /**
             * 题解的一个解法，不是从后面，而是直接正向找 94%
             * 猜想是，测试数据是那种，t和s在j很小的时候就完成了，但是从后面便利就需要很多无用的时间
             */
            if(s == null) return true;
            int i = 0, j = 0;
            while(i < s.length()){
                if(t.indexOf(s.charAt(i), j) > j)
                    j = t.indexOf(s.charAt(i), j) + 1;
                else break;
                i++;
            }
            return (i == s.length());
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}