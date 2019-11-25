package leetcode;

/**
 * @author lwc
 * @date 2019/11/20 20:38
 */
public class lc_213 {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0) return 0;
        if(len == 1) return nums[0];

        int[] head = new int[len];
        int[] next = new int[len];

        head[0] = nums[0];
        head[1] = Math.max(head[0], nums[1]);
        next[1] = nums[1];

        for(int i = 2; i < len; i++){
            if(i != len - 1) {
                head[i] = Math.max(head[i - 2] + nums[i], head[i - 1]);
            }
            next[i] = Math.max(next[i-2] + nums[i], next[i-1]);
        }

        return Math.max(head[len - 2], next[len - 1]);
    }
}
