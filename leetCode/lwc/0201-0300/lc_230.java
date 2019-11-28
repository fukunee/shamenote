package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author lwc
 * @date 2019/11/25 9:28
 */
public class lc_230 {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, Comparator.reverseOrder());
        recursive(root, k, queue);
        return queue.peek();
    }

    public void recursive(TreeNode root, int k, PriorityQueue queue){
        if(root == null) return;
        recursive(root.left, k, queue);
        if(queue.size() < k)
            queue.offer(root.val);
        recursive(root.right, k, queue);
    }
}
