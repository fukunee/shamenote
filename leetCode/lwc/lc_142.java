package solution2;

/**
 * @author lwc
 * @date 2019/11/5 9:23
 */
public class U142 {
    public ListNode detectCycle(ListNode head) {
        ListNode p = head, q = head;
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
            if(p == q) break;
        }
        if(q == null || q.next == null) return null;
        p = head;
        while(p != q){
            q = q.next;
            p = p.next;
        }
        return p;
    }
}
