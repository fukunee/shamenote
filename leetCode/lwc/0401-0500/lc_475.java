package leetcode;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author lwc
 * @date 2020/4/17 10:44
 */
public class lc_475 {
    public int findRadius(int[] houses, int[] heaters) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int heat : heaters) set.add(heat);
        int radius = 0;
        for(int house : houses){
            int cur = Integer.MAX_VALUE;
            Integer v1 = set.ceiling(house);
            Integer v2 = set.floor(house);
            if(v1 != null) cur = Math.min(v1 - house, cur);
            if(v2 != null) cur = Math.min(house - v2, cur);
            radius = Math.max(cur, radius);
        }
        return radius;
    }
}
