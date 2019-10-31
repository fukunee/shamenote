/*Partition List*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small= new ListNode(0);
        ListNode big= new ListNode(0);
        
        ListNode heads=small;
        ListNode headb=big;
        ListNode p=head;
        while(p!=null){
            if(p.val<x){
                heads.next=p;
                heads=heads.next;
            }else{
                headb.next=p;
                headb=headb.next;
            }
            p=p.next;
        }
        headb.next=null;
        heads.next=big.next;
        return small.next;
    }
}