//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入："ab-cd"
//输出："dc-ba"
// 
//
// 示例 2： 
//
// 输入："a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 示例 3： 
//
// 输入："Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示： 
//
// 
// S.length <= 100 
// 33 <= S[i].ASCIIcode <= 122 
// S 中不包含 \ or " 
// 
// Related Topics 字符串

package cn;

public class ReverseOnlyLetters {
    public static void main(String[] args) {

        Solution solution = new ReverseOnlyLetters().new Solution();
        System.out.print(solution.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseOnlyLetters(String S) {
            int i = 0, n = S.length(), j = 0;
            if (n == 0) return "";
            if (n == 1) return S;
            char[] b = new char[n];
            char a = 'a';
            StringBuilder str = new StringBuilder(S);
            for (; i < n; i++) {
                a = S.charAt(i);
                if (a <= 'Z' && a >= 'A' || a <= 'z' && a >= 'a') {
                    b[j++] = a;
                    str.setCharAt(i, 'a');
                }
            }
            for (i = 0, j = str.length()-1; j >= 0; ) {
                if (str.charAt(j) == 'a') {
                    str.setCharAt(j, b[i]);
                    i++;
                }
                j--;
            }
            return str.toString();
        }
    }


}
//leetcode submit region end(Prohibit modification and deletion)

