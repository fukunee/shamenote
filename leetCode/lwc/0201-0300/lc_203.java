package leetcode;

/**
 * @author lwc
 * @date 2019/11/18 17:11
 */
public class lc_203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode p = preHead;
        while(p != null && p.next != null){
            if(p.next.val == val)
                p.next = p.next.next;
            else
                p = p.next;
        }
        return preHead.next;
    }
}
