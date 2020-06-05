package leetcode;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2020/2/7 22:09
 */
public class lc_462 {
    public int minMoves2(int[] nums) {
        if(nums.length < 2) return 0;
        Arrays.sort(nums);
        int r1 = nums[nums.length / 2];
        int r2 = nums[nums.length / 2 - 1];
        int s1 = 0, s2 = 0;
        for(int num : nums){
            s1 += Math.abs(num - r1);
            s2 += Math.abs(num - r2);
        }
        return Math.min(s1, s2);
    }
}