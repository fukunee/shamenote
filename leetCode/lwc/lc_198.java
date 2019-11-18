package leetcode;

/**
 * @author lwc
 * @date 2019/11/17 21:56
 */
public class lc_198 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        int[] v = new int[nums.length];
        if(nums.length > 0) v[0] = nums[0];
        if(nums.length > 1) v[1] = Math.max(v[0], nums[1]);
        for(int i = 2; i < nums.length; i++){
            v[i] = Math.max(v[i-1], v[i-2] + nums[i]);
        }
        return v[nums.length - 1];
    }
}
