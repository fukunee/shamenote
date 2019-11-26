package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/11/16 20:58
 */
public class lc_189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if(k == 0) return;
        int[] v = nums.clone();
        for(int i = 0; i < len; i++){
            nums[i] = v[(i + len - k) % len];
        }
    }
}
