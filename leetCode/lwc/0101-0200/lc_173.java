package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/15 16:17
 */
public class BSTIterator {
    List<Integer> iterator;
    int curIndex;

    public BSTIterator(TreeNode root) {
        iterator = new ArrayList<>();
        preOrder(root, iterator);
        curIndex = 0;
    }

    private void preOrder(TreeNode root, List<Integer> rs){
        if(root == null) return;
        preOrder(root.left, rs);
        rs.add(root.val);
        preOrder(root.right, rs);

    }

    /** @return the next smallest number */
    public int next() {
        return iterator.get(curIndex++);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return curIndex < iterator.size();
    }
}
