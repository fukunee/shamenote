package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/21 21:15
 */
public class U92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        List<ListNode> list = new ArrayList<>();
        list.add(null);

        ListNode pre = null,cur = head;
        int pos = 1;
        while(cur != null){
            ListNode next = cur.next;
            if(pos > m && pos <= n)
                cur.next = pre;
            list.add(cur);
            pre = cur;
            cur = next;
            pos ++;
        }
        list.add(null);
        list.get(m).next = list.get(n+1);
        if(list.get(m-1) == null) return list.get(n);
        else{
            list.get(m-1).next = list.get(n);
            return list.get(1);
        }
    }
}
