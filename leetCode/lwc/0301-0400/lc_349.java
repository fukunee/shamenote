package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/10 9:17
 */
public class lc_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        HashSet<Integer> res = new HashSet<>();
        for(int num : nums2){
            if(set.contains(num)) res.add(num);
        }
        int[] v = new int[res.size()];
        int i = 0;
        for(int num : res){
            v[i++] = num;
        }
        return v;
    }
}
