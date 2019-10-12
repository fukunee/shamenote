package solution2;

/**
 * @author lwc
 * @date 2019/10/11 16:49
 */
public class U61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        ListNode l1 = head;
        ListNode l2 = head;
        int v = 1;

        while(l1.next != null && ++v > 0)
            l1 = l1.next;
        int pos = v - (k % v);

        for(v = 1; v < pos; v++)
            l2 = l2.next;

        l1.next = head;
        l1 = l2.next;
        l2 = l2.next = null;

        return l1;
    }
}
