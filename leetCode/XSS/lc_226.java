public class lc_226 {
    public static void main(String[] args) {

    }
    static class Solution {
        public TreeNode invertTree(TreeNode root) {
            if(root==null)return root;
            TreeNode temp=root.right;
            root.right=root.left;
            root.left=temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
    }
}
