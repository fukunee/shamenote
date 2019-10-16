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
        ListNode f=new ListNode(0);
        f.next=head;
        ListNode q=f;
        ListNode p=q.next;
        
        while(p!=null&&p.next!=null){
            q.next=p.next;
            p.next=q.next.next;
            q.next.next=p;
            q=p;
            p=q.next;
        }
        return f.next;
    }
}