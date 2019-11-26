package leetcode;

/**
 * @author lwc
 * @date 2019/11/22 15:02
 */
public class lc_222 {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
