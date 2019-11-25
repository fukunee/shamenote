package leetcode;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author lwc
 * @date 2019/11/21 11:47
 */
public class lc_217 {
    public boolean containsDuplicate(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }
}
