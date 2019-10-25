/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode f = new ListNode(0);        
        f.next=head;
        ListNode q = f;
        a
        for(int i=1;i<m&&q.next!=null;i++){
            q=q.next;
        }
        
        ListNode p = q.next;
        
        for(int i=m;i<n&&p!=null;i++){
            ListNode t = p.next;
            p.next=t.next;
            t.next=q.next;
            q.next=t;
        }
        
        return f.next;
    }
}