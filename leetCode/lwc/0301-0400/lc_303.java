package leetcode;

/**
 * @author lwc
 * @date 2019/11/28 10:06
 */
public class lc_303 {
    class NumArray {
        int[] v;

        public NumArray(int[] nums) {
            v = new int[nums.length + 1];
            for (int i = nums.length - 1; i >= 0; i--) {
                v[i] = nums[i] + v[i + 1];
            }
        }

        public int sumRange(int i, int j) {
            return v[i] - v[j + 1];
        }
    }
}
