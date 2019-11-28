public class lc_112 {
    public static void main(String[] args) {

    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {

            return fun(root,0,sum);

        }
        public boolean fun(TreeNode r,int sum,int target)
        {
            if(r==null)return false;
            if(r.left==null&&r.right==null)
            {
                if(sum+r.val==target)return true;
            }
            if(r.left!=null&&fun(r.left,sum+r.val,target))return true;
            if(r.right!=null&&fun(r.right,sum+r.val,target))return true;
            return false;
        }
    }
}
