package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @author lwc
 * @date 2019/12/21 19:08
 */
public class lc_398 {
    public class Solution {

        int[] nums;
        Random rnd;

        public Solution(int[] nums) {
            this.nums = nums;
            this.rnd = new Random();
        }

        public int pick(int target) {
            int result = -1;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    if (rnd.nextInt(++count) == 0)
                        result = i;
                }
            }

            return result;
        }
    }
}
