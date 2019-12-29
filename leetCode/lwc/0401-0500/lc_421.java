package leetcode;

/**
 * @author lwc
 * @date 2019/12/26 15:15
 */
public class lc_421 {
    public int findMaximumXOR(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                res = Math.max(res, nums[i] ^ nums[j]);
            }
        }
        return res;
    }
}
