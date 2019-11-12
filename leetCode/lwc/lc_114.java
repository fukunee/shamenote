package solution2;

/**
 * @author lwc
 * @date 2019/10/29 9:01
 */
public class U114 {
    public void flatten(TreeNode root){
        if(root == null) return;
        flatten(root.left);
        flatten(root.right);

        TreeNode rHead = root.right;
        root.right = root.left;
        root.left = null;
        while(root.right != null) root = root.right;
        root.right = rHead;

    }

}
