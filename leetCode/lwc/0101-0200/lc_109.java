package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/28 15:25
 */
public class U109 {

    // 22 java faster
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }

        return recursive(list,0,list.size());
    }
    public TreeNode recursive(List<Integer> list, int start, int end){
        int len = end - start;
        if(len < 1) return null;
        if(len == 1) return new TreeNode(list.get(start));

        TreeNode root = new TreeNode(list.get((start+end)/2));
        root.left = recursive(list,start,(start+end)/2);
        root.right = recursive(list,(start+end)/2 + 1,end);

        return root;
    }


}
