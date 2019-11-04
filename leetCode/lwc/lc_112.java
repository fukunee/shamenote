package solution2;

/**
 * @author lwc
 * @date 2019/10/28 23:06
 */
public class U112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;
        if(root.val == sum && root.right == null && root.left == null)
            return true;
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
