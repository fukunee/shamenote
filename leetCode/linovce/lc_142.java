
  Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode q = head;
        ListNode p = head;
        
        while(q!=null){
            q=q.next;
            if(q!=null)
                q=q.next;
            else
                return null;
            p=p.next;
            
            if(q==p){
                q=head;
                while(q!=p){
                    q=q.next;
                    p=p.next;
                }
                return q;
            }
        }
        return null;
    }
}