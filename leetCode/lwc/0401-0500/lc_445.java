package leetcode;

import java.util.LinkedList;

/**
 * @author lwc
 * @date 2020/1/10 10:01
 */
public class lc_445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        LinkedList<ListNode> q1 = new LinkedList<>();
        LinkedList<ListNode> q2 = new LinkedList<>();

        while(l1 != null) {
            q1.push(l1);
            l1 = l1.next;
        }
        while(l2 != null){
            q2.push(l2);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode next = null;
        while(!q1.isEmpty() || !q2.isEmpty()){
            int v1 = q1.isEmpty() ? 0 : q1.pop().val;
            int v2 = q2.isEmpty() ? 0 : q2.pop().val;
            int val = v1 + v2 + carry;
            ListNode cur = new ListNode(val % 10);
            cur.next = next;
            next = cur;
            carry = val / 10;
        }
        if(carry != 0){
            ListNode cur = new ListNode(carry);
            cur.next = next;
            next = cur;
        }
        return next;
    }
}
