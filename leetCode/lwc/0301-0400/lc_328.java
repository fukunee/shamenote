package leetcode;

/**
 * @author lwc
 * @date 2019/12/6 9:41
 */
public class lc_328 {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode p = head, q = head.next, qHead = q;
        while (q != null && q.next != null){
            p.next = q.next;
            p = p.next;
            q.next = p.next;
            q = q.next;
        }
        p.next = qHead;
        return head;
    }
}
