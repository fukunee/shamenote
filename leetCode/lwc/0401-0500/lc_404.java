package leetcode;

/**
 * @author lwc
 * @date 2019/12/22 16:35
 */
public class lc_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int res = 0;
        TreeNode left = root.left;
        if(left != null && left.left == null && left.right == null)
            res += left.val;
        else res += sumOfLeftLeaves(left);
        res += sumOfLeftLeaves(root.right);
        return res;
    }
}
