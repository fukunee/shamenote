package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwc
 * @date 2019/11/21 16:28
 */
public class lc_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(map.containsKey(num) && i - map.get(num) <= k)
                return true;
            map.put(num, i);
        }
        return false;
    }
}
