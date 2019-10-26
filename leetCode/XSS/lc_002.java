import java.util.List;

public class lc_002 {
    public static void main(String[] args) {
//两数相加2
    }

     // Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l=null;ListNode r = null;
            int jing=0;
            while(l1!=null&&l2!=null)
            {
                int num=l1.val+l2.val+jing;
                if(num>=10)
                {
                    jing=1;
                    num=num%10;
                }
                else jing=0;

                ListNode p=new ListNode(num);
                if(r==null) {
                    l=p;
                    r = p;
                }
                else
                {
                    r.next=p;
                    r=r.next;
                }
                l1=l1.next;l2=l2.next;
            }
            while(l1!=null)
            {
                if(jing==1)
                {
                    if(l1.val+1<10)
                    {
                        l1.val=l1.val+1;
                        jing=0;
                    }
                    else
                    {
                        l1.val=0;
                        jing=1;
                    }
                }
                r.next=l1;
                r=r.next;l1=l1.next;
            }
            while(l2!=null)
            {
                if(jing==1)
                {
                    if(l2.val+1<10)
                    {
                        l2.val=l2.val+1;
                        jing=0;
                    }
                    else
                    {
                        l2.val=0;
                        jing=1;
                    }
                }
                r.next=l2;r=r.next;l2=l2.next;
            }
            if(jing==1)
            {
                ListNode p1=new ListNode(1);
                r.next=p1;
                r=r.next;
            }
            return l;
        }
    }
}
