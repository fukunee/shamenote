package solution2;

/**
 * @author lwc
 * @date 2019/10/27 11:39
 */
public class U101 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return recursive(root.left,root.right);
    }

    public boolean recursive(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q==null || p.val != q.val) return false;
        return recursive(p.left,q.right) && recursive(p.right,q.left);
    }
}
