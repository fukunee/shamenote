public class lc_021 {
    public static void main(String[] args) {
//合并两个有序链表
    }

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode p=null,head=null;
            while(l1!=null&&l2!=null)
            {
                if(l1.val>l2.val)
                {
                    if(head==null)
                    {
                        head=l2;
                        p=head;
                        l2=l2.next;
                    }
                    else
                    {
                        p.next=l2;
                        p=p.next;
                        l2=l2.next;
                    }
                }
                else
                {
                    if(head==null)
                    {
                        head=l1;
                        p=head;
                        l1=l1.next;
                    }
                    else
                    {
                        p.next=l1;
                        p=p.next;
                        l1=l1.next;
                    }
                }
            }
            if (l1!=null)
            {
                if(head==null)head=l1;
                else p.next=l1;
            }
            if(l2!=null)
            {
                if(head==null)head=l2;
                else  p.next=l2;
            }
            return head;
        }
    }
}
