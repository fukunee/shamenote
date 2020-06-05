package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2020/1/13 9:31
 */
public class lc_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                int pre = nums[i];
                while(pre != nums[pre - 1]){
                    int t = nums[pre - 1];
                    nums[pre - 1] = pre;
                    pre = t;
                }
            }
        }
        List<Integer> rs = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1) rs.add(i + 1);
        }
        return rs;
    }
}
