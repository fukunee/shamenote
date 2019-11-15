import java.util.List;

public class lc_141 {
    public static void main(String[] args) {
        //判断链表是否有环，快慢指针解决
    }
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head==null)return false;
            if(head.next==null)return false;
            ListNode p1=head.next.next;
            ListNode p2=head;
            while(p1!=null&&p2!=null)
            {
                if(p1==p2)return true;
                else
                {
                    if(p1.next==null)return false;
                    p1=p1.next.next;
                    p2=p2.next;
                }
            }
            return false;
        }
    }
}
