package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lwc
 * @date 2019/12/10 9:26
 */
public class lc_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int num : nums1) map1.put(num, map1.getOrDefault(num, 0) + 1);
        for(int num : nums2) map2.put(num, map2.getOrDefault(num, 0) + 1);
        List<Integer> res = new ArrayList<>();
        for(int num : map1.keySet()){
            if(map2.containsKey(num)){
                int count = Math.min(map1.get(num), map2.get(num));
                for(int i = 0; i < count; i++) res.add(num);
            }
        }
        int[] v = new int[res.size()];
        for(int i = 0; i < v.length; i++) v[i] = res.get(i);
        return v;
    }
}
