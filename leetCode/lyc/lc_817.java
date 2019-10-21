/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        if(head==null){
            return 0;
        }
        ListNode p=head;
        Set<Integer> set=new HashSet<>();
        int tag=0;
        for(int i:G){
            set.add(i);
        }
        while(p.next!=null){
            if(set.contains(p.val)&&!set.contains(p.next.val)){
                tag+=1;
            }
            p=p.next;
        }
        if(set.contains(p.val)){
            tag+=1;
        }
        return tag;
    }
}