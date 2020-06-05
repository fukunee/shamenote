package leetcode;

/**
 * @author lwc
 * @date 2020/1/2 11:31
 */
public class lc_430 {
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };

    public Node flatten(Node head) {
        help(head);
        return head;
    }

    public Node help(Node head) {
        while (head != null && (head.next != null || head.child != null)) {
            while(head != null && head.child == null && head.next != null){
                head = head.next;
            }
            if (head.child != null) {
                Node next = head.next;
                head.next = head.child;
                head.next.prev = head;
                head.child = null;
                Node cur = help(head.next);
                cur.next = next;
                if(next != null){
                    next.prev = cur;
                }
                head = cur;
            }
        }
        return head;
    }
}
