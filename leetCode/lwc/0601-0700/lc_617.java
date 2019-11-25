package solution2;

/**
 * @author lwc
 * @date 2019/10/30 16:12
 */
public class U617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null ) return t2;

        if(t2 != null) {
            t1.val = t1.val + t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
        }
        return t1;
    }


}
