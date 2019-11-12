package solution2;

/**
 * @author lwc
 * @date 2019/11/10 23:12
 */
public class U160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA, p2 = headB;int count = 0;
        while(p1 != p2){
            p1 = p1 == null ? headB : p1.next;
            p2 = p2 == null ? headA : p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        System.out.println(null == null);
    }
}
