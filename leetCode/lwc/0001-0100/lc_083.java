package solution2;

/**
 * @author lwc
 * @date 2019/10/20 18:01
 */
public class U83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode preHead = new ListNode(0);
        ListNode pre = preHead;
        preHead.next = head;
        ListNode cur = head;

        while(cur != null){
            while(cur.next != null && cur.next.val == cur.val){
                cur = cur.next;
            }
            pre.next = cur;
            pre = pre.next;
            cur = cur.next;
        }

        return preHead.next;
    }
}
