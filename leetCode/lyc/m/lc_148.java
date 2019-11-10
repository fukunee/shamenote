/*Sort List*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        return mergesort(head);
    }
    
    public ListNode mergesort(ListNode head){
        if(head.next == null){
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode p = null;
        while (fast != null && fast.next != null) {
            p = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        p.next = null;
        ListNode mid = slow;
        ListNode left = mergesort(head);
        ListNode right = mergesort(mid);
        return sort(left, right);
    }
    
    public ListNode sort(ListNode left,ListNode right){
        ListNode fir = new ListNode(-1);
        ListNode pre = fir;
        while(left != null && right != null){
            if(left.val <= right.val){
                pre.next = left;
                pre = pre.next;
                left = left.next;
            }else{
                pre.next = right;
                pre = pre.next;
                right = right.next;
            }
        }
        if(left != null){
            pre.next = left;
        }
        if(right != null){
            pre.next = right;
        }
        return fir.next;
    }
}