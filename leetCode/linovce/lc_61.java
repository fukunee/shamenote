
  Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==nullhead.next==nullk==0)
            return head;
        ListNode p = head,q = head;
        
        int n=k;
        while(n!=0){
            if(p.next!=null){
                p=p.next;
                n--;
            }                
            else{
                n--;
                int t=k-n;
                
                n=n%t;
                p=head;
            }
                
            
        }
        
        while(p.next!=null){
            p=p.next;
            if(q.next!=null)
                q=q.next;
            else
                q=head;
        }
        ListNode t = q.next;
        if(q.next!=null){
            
            q.next=null;
            p.next=head;
        }
            
        else{
            t=head;
        }
        return t;
    }
}