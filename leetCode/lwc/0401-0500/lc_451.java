package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * @author lwc
 * @date 2020/1/13 16:56
 */
public class lc_451 {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> queue = new PriorityQueue<>((v1,v2)->v2.getValue()-v1.getValue());
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            queue.offer(entry);
        }
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()){
            Map.Entry<Character,Integer> entry = queue.poll();
            char key = entry.getKey();
            int value = entry.getValue();
            while(value > 0){
                sb.append(key);
                value--;
            }
        }
        return sb.toString();
    }
}
