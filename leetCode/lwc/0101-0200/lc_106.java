package solution2;

/**
 * @author lwc
 * @date 2019/10/26 19:59
 */
public class U106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length == 0) return null;

        TreeNode[] v = new TreeNode[postorder.length];
        int i = postorder.length-2, j = inorder.length-1, pos = 0;
        v[0] = new TreeNode(postorder[postorder.length-1]);
        TreeNode rs = v[0];

        while(i >= 0){
            while(pos >= 0 && j >=0 && inorder[j] == v[pos].val){
                j --;
                pos --;
            }
            TreeNode cur = new TreeNode(postorder[i--]);
            if(j < inorder.length-1 && v[pos+1]!= null && inorder[j+1] == v[pos+1].val){
                TreeNode root = v[pos+1];
                root.left = cur;
            }
            else{
                TreeNode root = v[pos];
                root.right = cur;
            }
            v[++pos] = cur;
        }
        return rs;
    }
}
