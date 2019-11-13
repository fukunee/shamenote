//给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
//
// 示例: 
//
// 输入: n = 4, k = 2
//输出:
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
// Related Topics 回溯算法

package cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {

        Solution solution = new Combinations().new Solution();
        solution.combine(4, 2);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            /**
             * 18% 感觉是强行使用位运算翻车了，试试如果不用的效果
             */
            /*version1
            int i = 0, j = 0, arr = (1 << n) - 1;
            while (i <= arr) {
                hasone(i, n, k);
                i++;
            }
            return ret;
            version1
             */
            /**
             * 99%version2
             */
            int i = 0, j = 0;

                backtrack(i, n, k);

            return ret;
        }
        //version2
        private void backtrack(int begin, int end, int num) {
            if (num == 0) {
                List<Integer> nlist = new ArrayList<>(list);
                ret.add(nlist);
                return;
            }
            while (begin <= end - num + 1) {
                list.add(begin);
                backtrack(begin + 1, end, num - 1);
                list.remove(list.size() - 1);
                begin++;
            }//version2
        }
        /*version1
        private void hasone(int n, int len, int k) {
            int i = 0, j = 1;
            List<Integer> list = new ArrayList<>();
            while (j <= len) {
                if ((n & 1) == 1) {
                    list.add(j);
                    i++;
                }
                n >>= 1;
                j++;
                if(i > k || i+(len-j) < k) return;
            }
            if(k == i) ret.add(list);
        }
        version1
         */
    }
//leetcode submit region end(Prohibit modification and deletion)

}