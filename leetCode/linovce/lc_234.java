/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode q = head;
        ListNode p = head;
        while(q!=null){
            q=q.next;
            if(q!=null)
                q=q.next;
            p=p.next;
        }
        
        q=head;
        
        while(p!=null){
            stack.push(p);
            p=p.next;
        }
        
        while(!stack.empty()){
            if(q.val!=stack.pop().val)
                return false;
            q=q.next;
        }
        return true;
    }
}