/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode q = head;
        ListNode p = head;
        
        while(q!=null){
            q=q.next;
            if(q!=null)
                q=q.next;
            else
                return false;
            p=p.next;
            
            if(q==p)
                return true;
        }
        return false;
    }
}