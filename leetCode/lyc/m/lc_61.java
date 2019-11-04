/*Rotate List*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0||head==null){
            return head;
        }
        ListNode p=head;
        int n=1;
        while(p.next!=null){
            p=p.next;
            n++;
        }
        k%=n;
        p.next=head;
        for(int i=0;i<n-k;i++){
            head=head.next;
            p=p.next;
        }
        p.next=null;
        return head;
    }
}