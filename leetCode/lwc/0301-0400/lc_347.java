package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/9 17:37
 */
public class lc_347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>(k, (v1,v2) -> Integer.compare(v1.getValue(),v2.getValue()));
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> value : map.entrySet()){
            queue.offer(value);
            if(queue.size() > k) queue.poll();
        }
        List<Integer> rs = new ArrayList<>();
        while(!queue.isEmpty()) rs.add(queue.poll().getKey());
        return rs;
    }

}
