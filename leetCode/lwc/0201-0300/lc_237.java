package leetcode;

/**
 * @author lwc
 * @date 2019/11/25 16:23
 */
public class lc_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
