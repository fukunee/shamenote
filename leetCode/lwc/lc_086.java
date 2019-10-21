package solution2;

/**
 * @author lwc
 * @date 2019/10/20 18:39
 */
public class U86 {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode ln = partition(cur.next,x);
        if(cur.val < x || ln.val >= x) cur.next = ln;
        else{
            ListNode temp = ln;
            while(ln.next != null && ln.next.val < x){
                ln = ln.next;
            }
            cur.next = ln.next;
            ln.next = cur;
            cur = temp;
        }

        return cur;
    }
}
