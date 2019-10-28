 //给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
//
// 注意: 
//
// 
// 给定的整数保证在32位带符号整数的范围内。 
// 你可以假定二进制数不包含前导零位。 
// 
//
// 示例 1: 
//
// 
//输入: 5
//输出: 2
//解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
// 
//
// 示例 2: 
//
// 
//输入: 1
//输出: 0
//解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
// 
// Related Topics 位运算

  package cn;
  public class NumberComplement{
      public static void main(String[] args) {

           Solution solution = new NumberComplement().new Solution();
           System.out.print(solution.findComplement(5));
      }


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findComplement(int num) {
        /**
         * 80%
         */
        /*
        String a = Integer.toBinaryString(num);
        StringBuilder b = new StringBuilder(a);
        int i = 0;
        while(a.charAt(i) != '1') i++;
        for(; i < a.length(); i++){
            b.setCharAt(i, (char)('0'+('1'-a.charAt(i))));
        }

        return Integer.parseInt(b.toString(), 2);

         */
        /**
         * 尝试用异或来做 100
         */
        int i = 1, k = num;
        while(num > 0) {
            num >>= 1;
            i <<= 1;
        }
        i -= 1;
        return k^i;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }