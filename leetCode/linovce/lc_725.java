/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
        int n=0;
        ListNode q = root;
        while(q!=null){
            q=q.next;
            n++;
        }
        
        int a=n/k,b=n%k;
        ListNode[] r = new ListNode[k];
        
        q=root;
        int i=0,j=0;
        ListNode f = new ListNode(0);
        ListNode p = f;
        while(q!=null){
            if(j<a){
                p.next=q;
                q=q.next;
                p=p.next;
                p.next=null;
                j++;
            }else if(j==a&&b!=0){
                p.next=q;
                q=q.next;
                p=p.next;
                p.next=null;
                b--;
                r[i]=f.next;
                i++;
                j=0;
                f.next=null;
                p=f;
            }else{
                r[i]=f.next;
                i++;
                j=0;
                f.next=null;
                p=f;
            }        
            
        }
        
        r[i]=f.next;
        i++;
        j=0;
        f.next=null;
        p=f;
        
        return r;
    }
}