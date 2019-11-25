package solution2;

public class U21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l0 = new ListNode(0);
        ListNode rs = l0;
        while(l1!=null || l2!=null){
            if((l1!=null && l2!=null && l1.val<=l2.val) || (l1!=null && l2==null)) {
                l0.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            else if((l1!=null && l2!=null && l1.val>l2.val) || (l1==null && l2!=null)) {
                l0.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            l0 = l0.next;
        }

        return rs.next;
    }
}
