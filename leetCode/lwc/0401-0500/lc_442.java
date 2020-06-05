package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author lwc
 * @date 2020/1/4 22:26
 */
public class lc_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) lst.add(num);
            else set.add(num);
        }
        return lst;
    }
}
