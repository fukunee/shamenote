package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/5 21:15
 */
public class U143 {
    public void reorderList(ListNode head) {
        recursive(head, head);
    }
    public ListNode recursive(ListNode p, ListNode q) {
        if(q == null) return p;

        ListNode cur,next;
        if(q.next == null) cur = p;
        else cur = recursive(p.next, q.next.next);
        next = cur.next;
        if(p.next == cur || p == cur) cur.next = null;
        else {
            cur.next = p.next;
            p.next = cur;
        }
        return next;
    }


    public void reorderList2(ListNode head) {
        ListNode p = head;
        while(p != null && p.next != null && p.next.next != null){
            ListNode q = p;
            while(q.next != null && q.next.next != null){
                q = q.next;
            }
            if(p != q) {
                ListNode r = p.next;
                p.next = q.next;
                p.next.next = r;
                q.next = null;
                p = r;
            }
        }
    }
}
