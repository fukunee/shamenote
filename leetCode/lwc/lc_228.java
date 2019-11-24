package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/23 23:10
 */
public class lc_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> rs = new ArrayList<>();
        Arrays.sort(nums);
        int j, i = 0;
        while(i < nums.length){
            j = i;
            while(j + 1< nums.length && nums[j + 1] <= nums[j] + 1){
                j++;
            }
            if(i == j) rs.add(nums[i] + "");
            else rs.add(nums[i] + "->" + nums[j]);
            i = j + 1;
        }
        return rs;
    }
}
