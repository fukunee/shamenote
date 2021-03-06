//对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
//
// 返回字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。 
//
// 
//
// 示例 1： 
//
// 输入：str1 = "ABCABC", str2 = "ABC"
//输出："ABC"
// 
//
// 示例 2： 
//
// 输入：str1 = "ABABAB", str2 = "ABAB"
//输出："AB"
// 
//
// 示例 3： 
//
// 输入：str1 = "LEET", str2 = "CODE"
//输出：""
// 
//
// 
//
// 提示： 
//
// 
// 1 <= str1.length <= 1000 
// 1 <= str2.length <= 1000 
// str1[i] 和 str2[i] 为大写英文字母 
// 
// Related Topics 字符串

package cn;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {

        Solution solution = new GreatestCommonDivisorOfStrings().new Solution();
        String str1 = "ABABAB";
        String str2 = "ABA";
        System.out.print(solution.gcdOfStrings(str1, str2));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            if (str1 == null || str2 == null) return null;
            if(str1.length() == str2.length()){
                if(str1.equals(str2)) return str1;
                else return "";
            }
            int m = str1.length(), n = str2.length();
            if(m > n){
                 return gcdOfStrings(str1.substring(n), str2);
            }
            else return gcdOfStrings(str1, str2.substring(m));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}