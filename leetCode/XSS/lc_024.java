import java.util.List;

public class lc_024 {
    public static void main(String[] args) {

    }

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    static class Solution {
        public ListNode swapPairs(ListNode head) {
           if(head==null||head.next==null)return head;
            ListNode p=head;
            ListNode pp=p.next;
            head=pp;
            p.next=fun(pp.next);
            pp.next=p;
            return head;

        }
        public ListNode fun(ListNode p)
        {
            if(p==null||p.next==null)return p;
            ListNode pp=p.next;
            p.next=fun(p.next.next);
            pp.next=p;
            return pp;
        }
    }
}
