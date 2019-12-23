package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author lwc
 * @date 2019/12/18 9:59
 */
public class lc_384 {
    class Solution {
        int len;
        int[] v;
        int[] nums;


        public Solution(int[] nums) {
            this.len = nums.length;
            this.v = new int[len];
            this.nums = nums.clone();
            for(int i = 0; i < len; i++)
                v[i] = nums[i];
        }


        /** Resets the array to its original configuration and return it. */
        public int[] reset() {
            return nums;
        }

        /** Returns a random shuffling of the array. */
        public int[] shuffle() {
            Random random = new Random();
            for(int i = 0; i < len; i++){
                int index = i + random.nextInt(len - i);
                int value = v[i];
                v[i] = v[index];
                v[index] = value;
            }
            return v;
        }
    }
}
