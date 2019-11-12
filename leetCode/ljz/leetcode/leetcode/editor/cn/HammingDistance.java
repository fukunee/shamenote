//461
// 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
//
// 给出两个整数 x 和 y，计算它们之间的汉明距离。 
//
// 注意： 
//0 ≤ x, y < 231. 
//
// 示例: 
//
// 
//输入: x = 1, y = 4
//
//输出: 2
//
//解释:
//1   (0 0 0 1)
//4   (0 1 0 0)
//       ↑   ↑
//
//上面的箭头指出了对应二进制位不同的位置。
// 
// Related Topics 位运算

package cn;

public class HammingDistance {
    public static void main(String[] args) {

        Solution solution = new HammingDistance().new Solution();
        solution.hammingDistance(1,4);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int hammingDistance(int x, int y) {
            /**
             * 80% 题解写的用异或，
             */
            /*version1
            int diff = 0;
            while (x != 0 || y != 0) {
                if ((x & 1) != (y & 1)) diff++;
                x >>= 1;
                y >>= 1;
            }
            return diff;
            version1
             */
            /**
             * 但是也是80啊，，
             */
           //version2
            //return Integer.bitCount(x^y);
            //version3 也是80
            int z = x^y;
            z = (z & 0x55555555) + ((z >> 1) & 0x55555555);
            z = (z & 0x33333333) + ((z >> 2) & 0x33333333);
            z = (z & 0x0f0f0f0f) + ((z >> 4) & 0x0f0f0f0f);
            z = (z & 0x00ff00ff) + ((z >> 8) & 0x00ff00ff);
            z = (z & 0x0000ffff) + ((z >> 16) & 0x0000ffff);
            return (int)z;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}