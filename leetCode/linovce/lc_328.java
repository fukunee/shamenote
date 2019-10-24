/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
            return head;
        
        ListNode f1 = head;
        ListNode f2 = head.next;
        
        ListNode p=f1;
        ListNode q=f2;
        ListNode t=q.next;
        int f=0;
        
        while(t!=null){
            if(f==0){
                q.next=t.next;
                p.next=t;
                p=p.next;
                t.next=f2;
                t=q.next;
                f=1;
            }else{
                q=q.next;
                t=q.next;
                f=0;
            }
        }
        return f1;
    }
}