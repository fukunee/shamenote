/**
  Merge Two Sorted Lists
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode m=l1;
        ListNode n=l2;
        ListNode res=new ListNode(233);
        ListNode tag=res;
        while(m!=null&&n!=null){
            if(m.val<=n.val){
                tag.next=new ListNode(m.val);
                tag=tag.next;
                m=m.next;
            }else{
                tag.next=new ListNode(n.val);
                tag=tag.next;
                n=n.next;
            }
        }
        while(m!=null){
            tag.next=new ListNode(m.val);
            tag=tag.next;
            m=m.next;
        }
        while(n!=null){
            tag.next=new ListNode(n.val);
            tag=tag.next;
            n=n.next;
        }
        return res.next;
    }
}