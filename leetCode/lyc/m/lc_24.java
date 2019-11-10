/*Swap Nodes in Pairs*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null ||head.next == null){
            return head;
        }
        
        ListNode fir = new ListNode(-1);
        fir.next = head;
        ListNode temp = fir;
        
        while(temp.next != null && temp.next.next != null){
            ListNode pre = temp.next;
            ListNode cur = temp.next.next;
            temp.next = cur;
            pre.next = cur.next;
            cur.next = pre;
            
            temp = pre;
        }
        return fir.next;
    }
}