/**
    Add Two Numbers
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode m=l1;
        ListNode n=l2;
        int tag=0;
        ListNode res=new ListNode(233);
        ListNode fla=res;
        while(m!=null||n!=null){
            int p=(m!=null)?m.val:0;
            int q=(n!=null)?n.val:0;
            int sum=p+q+tag;
            tag=sum/10;
            ListNode temp=new ListNode(sum%10);
            fla.next=temp;
            fla=fla.next;
            if(m!=null){
                m=m.next;
            }
            if(n!=null){
                n=n.next;
            }
        }
        if(tag!=0){
            ListNode tem=new ListNode(tag);
            fla.next=tem;
        }
        return res.next;
    }
}