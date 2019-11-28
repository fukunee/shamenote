package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/21 22:30
 */
public class U206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        while(cur.next.next != null){
            cur = cur.next;
        }
        ListNode preHead = cur.next;
        cur.next = null;
        preHead.next = reverseList(head);
        return preHead;
    }

    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;

        int pos = 1;
        List<ListNode> list = new ArrayList<>();
        list.add(head);
        list.add(head.next);
        ListNode cur = head.next;
        head.next = null;

        while(cur != null){
            list.add(cur.next);
            cur.next = list.get(pos-1);
            cur = list.get(++pos);
        }

        return list.get(pos-1);
    }

}
