package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2020/1/2 22:12
 */
public class lc_435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int[] v : intervals){
            if(map.containsKey(v[1])){
                res = res + 1;
                if(v[0] > map.get(v[1])){
                    map.put(v[1], v[0]);
                }
            }
            else {
                map.put(v[1], v[0]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int pre = Integer.MIN_VALUE;
        for(int key : list){
            if(map.get(key) < pre){
                res++;
            }
            else{
                pre = key;
            }
        }

        return res;
    }
}
