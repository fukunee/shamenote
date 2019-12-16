public class lc_235 {
    public static void main(String[] args) {
        //二叉搜索数的最近公共祖先
    }
    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(p.val<root.val&&q.val<root.val)
            {
                return lowestCommonAncestor(root.left,p,q);
            }
            else if(p.val>root.val&&q.val>root.val)
            {
                return lowestCommonAncestor(root.right,p,q);
            }
            else return root;
        }
    }
}
