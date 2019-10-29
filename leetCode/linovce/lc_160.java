/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode r=null;
        if(headA==null||headB==null)
            return null;
        
        ListNode A = headA;
        ListNode B = headB;
        
        while(A!=null||B!=null){
            if(A==null)
                A=headB;
            if(B==null)
                B=headA;
            if(A==B){
                r=A;
                break;
            }
                
            A=A.next;
            B=B.next;
        }
        
        return r;
        
        
    }
}