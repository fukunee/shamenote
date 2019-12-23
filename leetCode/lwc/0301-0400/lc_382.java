package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author lwc
 * @date 2019/12/18 9:29
 */
public class lc_382 {
    class Solution {
        List<Integer> list;
        /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
        public Solution(ListNode head) {
            list = new ArrayList<>();
            while(head != null){
                list.add(head.val);
                head = head.next;
            }
        }

        /** Returns a random node's value. */
        public int getRandom() {
            Random random = new Random();
            return list.get(random.nextInt(list.size()));
        }
    }
}
