import java.util.List;

public class lc_234 {
    public static void main(String[] args) {
        //回文链表,快慢指针找到中心点，反转一半的链表
    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */

    static class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode h=new ListNode(-1);
            ListNode p=head;
            while (p!=null)
            {
                ListNode temp=new ListNode(p.val);
                temp.next=h.next;
                h.next=temp;
                p=p.next;
            }
            h=h.next;
            while (head!=null)
            {
                if(h.val!=head.val)
                {
                    return false;
                }
                else
                {
                    h=h.next;
                    head=head.next;
                }
            }
            return true;
        }
    }
}
