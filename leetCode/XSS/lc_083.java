public class lc_083 {
    public static void main(String[] args) {
//删除排序链表中的重复元素，*
    }

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if(head==null||head.next==null)return head;
            ListNode p=head.next;
            ListNode pp=head;
            int preval=head.val;
            while(p!=null)
            {
                if(p.val==preval)
                {
                    pp.next=p.next;
                }
                else {
                    pp=p;
                    preval=p.val;
                }
                p=p.next;
            }
            return head;
        }
    }
}
