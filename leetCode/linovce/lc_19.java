/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==0)
            return head;
        ListNode f=new ListNode(0);
        f.next=head;
        ListNode q=f;
        ListNode p=f;
        
        while(n!=0&&p.next!=null){
            p=p.next;
            n--;
        }
        
        while(p.next!=null){
            q=q.next;
            p=p.next;
        }
        
        q.next=q.next.next;
        return f.next;
    }
}