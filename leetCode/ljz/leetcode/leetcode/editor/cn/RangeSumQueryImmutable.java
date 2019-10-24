//给定一个整数数组 nums，求出数组从索引 i 到 j (i ≤ j) 范围内元素的总和，包含 i, j 两点。
//
// 示例： 
//
// 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
//
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3 
//
// 说明: 
//
// 
// 你可以假设数组不可变。 
// 会多次调用 sumRange 方法。 
// 
// Related Topics 动态规划

package cn;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class RangeSumQueryImmutable {
    public static void main(String[] args) {

        Solution solution = new RangeSumQueryImmutable().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class NumArray {
        /**
         * 89%
         */

        private int[] a;
        private  int[] b;
        public NumArray(int[] nums) {
            if(nums.length == 0) return;
            a = nums;
            b = new int[a.length];
            b[0] = a[0];
            for(int i = 1; i < a.length; i++){
                b[i] = b[i-1] + a[i];
            }
        }


        public int sumRange(int i, int j) {

            if(i == 0) return b[j];
            return b[j]-b[i-1];
        }

          
        /**
         * 超出内存限制，将2维数组换成map
         */
        /*
        private int[] a;
        private  int[][] b;
        public NumArray(int[] nums) {
            if(nums.length == 0) return;
            a = nums;
            b = new int[a.length][a.length];
            for(int i = 0; i < a.length; i++){
                b[i][i] = a[i];
                for(int j = i+1; j < a.length; j++){
                    b[i][j] = b[i][j-1] + a[j];
                }
            }
        }


        public int sumRange(int i, int j) {

           return b[i][j];
        }

         */
        /**
         * 超时，还是用第一个方法吧
         */
        /*
        Pair<Integer, Integer> pair;
        private int[] a;
        private Map<Pair, Integer> b = new HashMap<>();
        public NumArray(int[] nums) {
            if(nums.length == 0) return;
            a = nums;

            int sum;
            for(int i = 0; i < a.length; i++){
                sum = 0;
                for(int j = i+1; j < a.length; j++){
                    sum += a[j];
                    pair = new Pair<>(i, j);
                    b.put(pair, sum);
                }
            }
        }


        public int sumRange(int i, int j) {
            pair = new Pair<>(i, j);
            return b.get(pair);
        }

         */
    }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
//leetcode submit region end(Prohibit modification and deletion)

}