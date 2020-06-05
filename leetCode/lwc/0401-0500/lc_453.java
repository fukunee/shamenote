package leetcode;

/**
 * @author lwc
 * @date 2020/1/19 20:31
 */
public class lc_453 {
    public int minMoves(int[] nums) {
        if(nums.length == 0) return 0;
        int min = nums[0];
        for(int i : nums) min = Math.min(min, i);
        int res = 0;
        for(int i : nums) res += i - min;
        return res;
    }
}
