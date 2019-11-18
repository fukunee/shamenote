import java.util.List;

public class lc_160 {
    public static void main(String[] args) {

    }
    public static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            int lenA=getListLen(headA);int lenB=getListLen(headB);
            ListNode l;
            ListNode s;
            if(lenA-lenB>0)
            {
                l=headA;
                s=headB;
            }
            else {l=headB;s=headA;}
            int dis=Math.abs(lenA-lenB);
            int c=0;
            while (l!=null&&s!=null)
            {
                if(l==s)return l;
                if(c>=dis)
                {
                    l=l.next;s=s.next;
                }
                else
                {
                    l=l.next;
                }
                ++c;
            }
            return null;
        }
        public int getListLen(ListNode a)
        {
            int c=0;
            while(a!=null)
            {
                c++;
                a=a.next;
            }
            return c;
        }
    }
}
