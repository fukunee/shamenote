package leetcode;

/**
 * @author lwc
 * @date 2019/11/22 16:29
 */
public class lc_226 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = root.left, right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}
