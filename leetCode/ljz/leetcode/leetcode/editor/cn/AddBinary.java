//给定两个二进制字符串，返回他们的和（用二进制表示）。
//
// 输入为非空字符串且只包含数字 1 和 0。 
//
// 示例 1: 
//
// 输入: a = "11", b = "1"
//输出: "100" 
//
// 示例 2: 
//
// 输入: a = "1010", b = "1011"
//输出: "10101" 
// Related Topics 数学 字符串

package cn;

public class AddBinary {
    public static void main(String[] args) {

        Solution solution = new AddBinary().new Solution();
        String a = "11";
        String b = "1";
        System.out.print(solution.addBinary(a, b));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            /**
             * 89% 这里使用的insert，下面尝试用append再reverse
             * ...重新跑了一次，也是99，就很尴尬
             */
            /*
            int i = a.length() - 1, j = a.length() + b.length(), c = 0, temp = 0, m = b.length() - 1;
            StringBuilder ret = new StringBuilder();
            for (; i >= 0 || m >= 0 || c == 1; i--, --j, m--) {
                if(i >= 0 && m >= 0)
                    temp = (a.charAt(i) - '0') + (b.charAt(m) - '0') + c;
                else if(i >= 0)
                    temp = (a.charAt(i) - '0') + c;
                else if(m >= 0)
                    temp = (b.charAt(m) - '0') + c;
                else if(c == 1){
                    ret.insert(0, 1);
                    break;
                }
                if (temp == 0) ret.insert(0,'0');
                else if (temp == 1) {
                    ret.insert(0,'1');
                    c = 0;
                } else if (temp == 2) {
                    ret.insert(0, '0');
                    c = 1;
                } else if (temp == 3) {
                    ret.insert(0, '1');
                    c = 1;
                }
            }

            return ret.toString();

             */
            /**
             * 99%
             */
            int i = a.length() - 1, j = a.length() + b.length(), c = 0, temp = 0, m = b.length() - 1;
            StringBuilder ret = new StringBuilder();
            for (; i >= 0 || m >= 0 || c == 1; i--, --j, m--) {
                if(i >= 0 && m >= 0)
                    temp = (a.charAt(i) - '0') + (b.charAt(m) - '0') + c;
                else if(i >= 0)
                    temp = (a.charAt(i) - '0') + c;
                else if(m >= 0)
                    temp = (b.charAt(m) - '0') + c;
                else if(c == 1){
                    ret.append('1');
                    break;
                }
                if (temp == 0) ret.append('0');
                else if (temp == 1) {
                    ret.append('1');
                    c = 0;
                } else if (temp == 2) {
                    ret.append('0');
                    c = 1;
                } else if (temp == 3) {
                    ret.append('1');
                    c = 1;
                }
            }

            return ret.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}