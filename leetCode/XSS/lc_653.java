import java.util.ArrayList;
import java.util.List;

public class lc_653 {
    static class TreeNode
    {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static class Solution {
        List<Integer> list = new ArrayList<Integer>();
        public boolean findTarget(TreeNode root, int k) {
            inOrder(root);
            int head = 0;
            int tail = list.size() - 1;
            while(head < tail) {
                if(list.get(head) + list.get(tail) == k) {
                    return true;
                }
                if(list.get(head) + list.get(tail) < k) {
                    head++;
                }
                if(list.get(head) + list.get(tail) > k) {
                    tail--;
                }
            }
            return false;
        }
        public void inOrder(TreeNode root) {
            if(root == null) {
                return;
            }
            inOrder(root.left);
            list.add(root.val);
            inOrder(root.right);
        }
    }

}
