//自除数 是指可以被它包含的每一位数除尽的数。
//
// 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。 
//
// 还有，自除数不允许包含 0 。 
//
// 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。 
//
// 示例 1： 
//
// 
//输入： 
//上边界left = 1, 下边界right = 22
//输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
// 
//
// 注意： 
//
// 
// 每个输入参数的边界满足 1 <= left <= right <= 10000。 
// 
// Related Topics 数学

package cn;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {

        Solution solution = new SelfDividingNumbers().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            /**
             * 83% 不是最佳方法，最佳的方法应该是生成，再考虑一下生成要怎么写
             * 看了题解，这道题只能暴力，但是我看到有一个将int[]变成char[]操作的
             * 这样就可以不用不断/了，效率可能提高，改写一下试试
             */
            //version1
            int i = 0, j = 0, x = 0;
            List<Integer> ret = new ArrayList<>();
            while (left <= right) {
                if (left > 0 && left <= 9)
                    ret.add(left);
                else {
                    i = left;
                    while (i != 0) {
                        j = i % 10;
                        if (j == 0) break;
                        if (left % j != 0) break;
                        i /= 10;
                    }
                    if (i == 0) ret.add(left);
                }
                left++;
            }
            return ret;
            //version1

            /**
             * 28%我可去您🐎的String，试试改成char【】会不会好一点
             */
            /*version2
            int i = 0, j = 0, n = 0;
            List<Integer> ret = new ArrayList<>();
            while (left <= right) {
                if (left > 0 && left <= 9)
                    ret.add(left);
                else {
                    String str = String.valueOf(left);
                    n = str.length();
                    for(i = 0; i < n; i++){
                        j = str.charAt(i)-'0';
                        if((j < 0 || left % j != 0)
                            break;
                    }
                    if(i == n) ret.add(left);
                }
                left++;
            }
            return ret;
            version2
             */
            /**
             * 28% 爬，直接用int好了
             */
            /*version3
            int n = 0;
            List<Integer> ret = new ArrayList<>();
            while (left <= right) {
                if (left > 0 && left <= 9)
                    ret.add(left);
                else {
                    n = 0;
                    for(char c : String.valueOf(left).toCharArray()){
                        if(c == '0' || left % (c-'0') != 0) {
                            n = -1;
                            break;
                        }
                    }
                    if(n == 0) ret.add(left);
                }
                left++;
            }
            return ret;
            version3
             */

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}