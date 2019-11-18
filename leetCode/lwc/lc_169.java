package solution2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/11/14 15:06
 */
public class U169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            if(map.containsKey(value))
                map.put(value, map.get(value) + 1);
            else
                map.put(value, 1);
            if(map.get(value) > nums.length / 2)
                return value;
        }
        return -1;
    }

    //Boyer-Moore 投票算法
    public int majorityElement2(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
