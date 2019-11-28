package leetcode;

/**
 * @author lwc
 * @date 2019/11/26 21:58
 */
public class lc_268 {
    public int missingNumber(int[] nums) {
        int value = nums.length;
        for(int i = 0; i < nums.length; i++){
            value ^= nums[i] ^ i;
        }
        return value;
    }
}
