public class lc_142 {
    public static void main(String[] args) {
        //寻找链表得环入口
    }
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode p1=head;
            ListNode p2=head;
            while(true)
            {
                if(p1==null||p1.next==null)return null;

                p1=p1.next.next;
                p2=p2.next;
                if(p1==p2) break;
            }
            p1=head;
            while(p1!=p2)
            {
                p1=p1.next;
                p2=p2.next;
            }
            return p1;
        }
    }
}
