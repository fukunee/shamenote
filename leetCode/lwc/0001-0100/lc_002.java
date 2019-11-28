package solution2;

public class U2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int carry = 0,cur = 0;
        while(l1!=null || l2!=null || carry!=0){
            int sum = ((l1!=null?l1.val:0)+(l2!=null?l2.val:0)+(carry!=0?carry:0));
            cur = sum % 10;
            carry = sum / 10;
            prev.next = new ListNode(cur);
            prev = prev.next;

            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;
        }
        return head.next;
    }
}
