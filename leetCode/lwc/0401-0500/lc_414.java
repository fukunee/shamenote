package leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @author lwc
 * @date 2019/12/24 11:13
 */
public class lc_414 {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
                queue.offer(num);
                if(queue.size() > 3) queue.poll();
            }
        }

        if(queue.size() == 2) queue.poll();
        return queue.peek();
    }
}
