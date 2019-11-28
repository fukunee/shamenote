package leetcode;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/11/26 20:31
 */
public class lc_260 {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num))
                map.remove(num,1);
            else
                map.put(num,1);
        }
        int[] v = new int[2];
        int i = 0;
        for(int num : map.keySet()){
            v[i++] = num;
        }
        return v;
    }
}
