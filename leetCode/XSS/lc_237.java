public class lc_237 {
    public static void main(String[] args) {
        //删除链表中的结点，阅读理解
    }
    static class Solution {
        public void deleteNode(ListNode node) {
            node.val=node.next.val;
            node.next=node.next.next;
        }
    }
}
