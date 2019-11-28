package leetcode;

/**
 * @author lwc
 * @date 2019/11/25 11:16
 */
public class lc_234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = slow.next;
        ListNode pre = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = pre;
            pre = slow;
            slow = temp;
        }

        while(pre != null){
            if(pre.val != head.val)
                return false;
            pre = pre.next;
            head = head.next;
        }
        return true;
    }
}
