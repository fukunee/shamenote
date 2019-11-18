package solution2;

/**
 * @author lwc
 * @date 2019/11/11 20:57
 */
public class U148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode p = head, q = head;
        while(q.next != null && q.next.next != null){
            p = p.next;
            q = q.next.next;
        }
        q = sortList(p.next);
        p.next = null;
        p = sortList(head);

        ListNode preHead = new ListNode(0), temp = preHead;
        while(p != null && q != null){
            temp.next = p.val > q.val ? q : p;
            temp = temp.next;
            if(p.val > q.val) q = q.next;
            else p = p.next;
        }
        temp.next = p == null ? q : p;
        return preHead.next;
    }
}
