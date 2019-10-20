//有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
//
// 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。 
//
// 示例 1: 
//
// 
//输入: 
//bits = [1, 0, 0]
//输出: True
//解释: 
//唯一的编码方式是一个两比特字符和一个一比特字符。所以最后一个字符是一比特字符。
// 
//
// 示例 2: 
//
// 
//输入: 
//bits = [1, 1, 1, 0]
//输出: False
//解释: 
//唯一的编码方式是两比特字符和两比特字符。所以最后一个字符不是一比特字符。
// 
//
// 注意: 
//
// 
// 1 <= len(bits) <= 1000. 
// bits[i] 总是0 或 1. 
// 
// Related Topics 数组

package cn;

public class OneBitAnd2BitCharacters {
    public static void main(String[] args) {

        Solution solution = new OneBitAnd2BitCharacters().new Solution();
        int[] a = {1, 1, 1, 0};
        if (solution.isOneBitCharacter(a))
            System.out.print("1");
        else System.out.print("2");
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            /**
             * 方法1，80+
             */
            /*
            int n = bits.length, i = 0;
            if (n == 0 || bits[n - 1] != 0) return false;
            for (; i < n; ) {
                if (bits[i] == 1 && i == (n - 2)) return false;
                else if (bits[i] == 1) i += 2;
                else i++;
            }
            return true;

             */
            /**
             * 100%
             */
            int n = bits.length, i = 0;
            if (n == 0 || bits[n - 1] != 0) return false;
            n -= 2;
            for (; n >= 0; n--) {
                if (bits[n] > 0) i++;
                else break;
            }
            return (i % 2 == 0);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}