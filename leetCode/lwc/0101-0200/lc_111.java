package solution2;

/**
 * @author lwc
 * @date 2019/10/28 22:36
 */
public class U111 {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int lH = minDepth(root.left);
        int rH = minDepth(root.right);
        if(lH == 0 || rH == 0)
            return Math.max(lH,rH) + 1;
        else
            return Math.min(lH,rH) + 1;
    }

}
