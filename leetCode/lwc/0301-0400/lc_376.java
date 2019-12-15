package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/14 21:40
 */
public class lc_376 {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        if(len < 2) return len;
        int pre = nums[0];
        int cur = 0, i = 1, rs = 1;
        while(i < len && nums[i] == pre) i++;
        if(i < len){
            cur = nums[i] - pre;
            pre = nums[i++];
            rs += 1;
        }

        while(i < len){
            while(i < len && cur * (nums[i] - pre) >= 0){
                pre = nums[i];
                i++;
            }
            if(i < len){
                cur *= -1;
                pre = nums[i++];
                rs += 1;
            }
        }
        return rs;
    }
}
