package solution2;

/**
 * @author lwc
 * @date 2019/10/20 14:50
 */
public class U82 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode l1 = new ListNode(0);
        ListNode l2,left,right;
        l1.next = l2 = head;
        left = l1;

        int value = 1;
        while(l2.next != null){
            right = l2;
            l2 = l2.next;
            if(l2.val == right.val) value++;
            else{
                if(value < 2){
                    left.next = right;
                    left = right;
                }
                value = 1;
            }
        }
        if(value < 2) left.next = l2;
        else left.next = null;
        return l1.next;
    }


    public ListNode deleteDuplicates2(ListNode head) {
        if(head == null) return null;
        ListNode preHead = new ListNode(0);
        ListNode pre = preHead;
        preHead.next = head;
        ListNode cur = head;

        while(cur != null){
            while(cur.next != null && cur.next.val == cur.val){
                cur = cur.next;
            }
            if(pre.next == cur) pre = pre.next;
            else pre.next = cur.next;
            cur = cur.next;
        }
        return preHead.next;
    }
}
