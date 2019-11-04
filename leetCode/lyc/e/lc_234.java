/*Palindrome Linked List*/
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
        if(head==null){
            return true;
        }
        int count=0;
        ListNode p=head;
        
        while(p!=null){
            count+=1;
            p=p.next;
        }
        int[] node=new int[count];
        p=head;
        int k=0;
        while(p!=null){
            node[k++]=p.val;
            p=p.next;
        }
        int i=0;
        int j=count-1;
        while(i<j){
            if(node[i]!=node[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}