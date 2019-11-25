package leetcode;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/11/20 9:47
 */
public class lc_209 {
    public int minSubArrayLen(int s, int[] nums) {
        int pos = 0;
        int value = 0;
        int min = nums.length + 1;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num >= s)
                return 1;
            else{
                value += num;
                while(value >= s){
                    min = Math.min(min, i - pos + 1);
                    value -= nums[pos++];
                }
            }
        }
        return min > nums.length ? 0 : min;
    }
}
