package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2020/1/3 9:31
 */
public class lc_436 {
    public int[] findRightInterval(int[][] intervals) {
        HashMap<Integer,Integer> head = new HashMap<>();
        for(int i = 0; i < intervals.length; i++){
            if(!head.containsKey(intervals[i][0])){
                head.put(intervals[i][0], i);
            }
        }
        List<Integer> list = new ArrayList<>(head.keySet());
        Collections.sort(list);
        int max = list.get(list.size() - 1);
        int[] v = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            int key = intervals[i][1];
            if(key > max)
                v[i] = -1;
            else{
                int j = list.size() - 1;
                for(; j >= 0; j--){
                    if(key > list.get(j)) break;
                }
                v[i] = head.get(list.get(j+1));
            }
        }
        return v;
    }
}
