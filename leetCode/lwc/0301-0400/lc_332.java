package leetcode;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/6 11:49
 */
public class lc_332 {
    public List<String> findItinerary(List<List<String>> tickets) {
        //可采用堆排序更快
        LinkedList<String> res = new LinkedList<>();
        Collections.sort(tickets, (v1,v2) -> v1.get(1).compareTo(v2.get(1)));
        Map<String,LinkedList<String>> map = new HashMap<>();
        for(List<String> v : tickets){
            if(!map.containsKey(v.get(0)))
                map.put(v.get(0), new LinkedList<>());
            map.get(v.get(0)).offer(v.get(1));
        }
        //backTrack(map, "JFK", res, tickets.size() + 1);
        reverse("JFK", map, res);
        return res;
    }

    public void reverse(String from, Map<String,LinkedList<String>> map, LinkedList res){
        LinkedList<String> list = map.get(from);
        while(list != null && !list.isEmpty()){
            String to = list.remove(0);
            reverse(to, map, res);
        }
        res.add(0, from);
    }

    public void backTrack(Map<String,LinkedList<String>> map, String from, LinkedList res, int size) {
        res.add(from);
        if(res.size() == size) return;
        if (map.containsKey(from)) {
            List<String> list = map.get(from);
            for (int i = 0; i < list.size(); i++) {
                String to = list.get(i);
                list.remove(list.size()-1);
                backTrack(map, to, res, size);
                if(res.size() != size) {
                    list.add(i, to);
                    res.remove(res.size() - 1);
                }
            }
        }
    }
}
