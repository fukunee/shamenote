package solution2;

/**
 * @author lwc
 * @date 2019/11/11 9:37
 */
public class U147 {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode nextHead = insertionSortList(head.next);
        if(nextHead == null || head.val < nextHead.val) {
            head.next = nextHead;
            return head;
        }
        ListNode p = nextHead;
        while(p != null){
           if(p.next == null || head.val < p.next.val){
               head.next = p.next;
               p.next = head;
               break;
           }
           p = p.next;
        }
        return nextHead;
    }

    public ListNode insertionSortList2(ListNode head) {
        if(head == null) return null;
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode cur = head.next, tail= head;
        while(cur != null){
            if(cur.val >= tail.val){
                tail = cur;
                cur = cur.next;
            }
            else{
                tail.next = cur.next;
                ListNode p = preHead;
                while(p.next.val < cur.val){
                    p = p.next;
                }
                cur.next = p.next;
                p.next = cur;
                cur = tail.next;
            }
        }
        return preHead.next;
    }
}
