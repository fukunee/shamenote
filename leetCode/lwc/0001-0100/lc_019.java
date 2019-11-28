package solution2;

import java.util.ArrayList;
import java.util.List;

public class U19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        list.remove(list.size()-n);
        ListNode temp = new ListNode(0);
        ListNode rs = temp;
        for(int i = 0;i < list.size(); i++){
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }

        return rs.next;
    }
}
