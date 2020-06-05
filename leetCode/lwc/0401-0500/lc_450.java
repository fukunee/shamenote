package leetcode;

/**
 * @author lwc
 * @date 2020/1/13 14:18
 */
public class lc_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;
        if(key < root.val)
            root.left = deleteNode(root.left, key);
        if(key > root.val)
            root.right = deleteNode(root.right, key);
        if(root.val == key){
            TreeNode left = root.left;
            TreeNode right = root.right;
            if(left == null && right == null){
                root = null;
            }
            else {
                if (root.right == null) {
                    root.val = left.val;
                    root.right = left.right;
                    root.left = left.left;
                } else {
                    root.val = right.val;
                    root.left = right.left;
                    root.right = right.right;
                    deleteNode(left, key);
                    if(left != null){
                        TreeNode temp = root;
                        while(temp.left != null) temp = temp.left;
                        temp.left = left;
                    }
                }
            }
        }
        return root;
    }
}
