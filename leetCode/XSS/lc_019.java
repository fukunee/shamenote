import java.util.List;

public class lc_019 {
    public static void main(String[] args) {
//删除链表的倒数第n个节点
    }

     //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode p=head;ListNode p1=head;ListNode pre=null;
            int count=0;
            while (p!=null)
            {
                p=p.next;
                if(count>=n) {
                    pre=p1;
                    p1 = p1.next;
                }
                count++;
            }
            if(count==n)return head.next;
            pre.next=p1.next;
            return head;
        }
    }
}
