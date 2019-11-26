package solution2;

/**
 * @author lwc
 * @date 2019/11/5 9:20
 */
public class U141 {
    public boolean hasCycle(ListNode head) {
        ListNode p = head, q = head;
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
            if(p == q) return true;
        }
        return false;
    }
}
