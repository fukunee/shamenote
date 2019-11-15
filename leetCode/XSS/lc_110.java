public class lc_110 {
    public static void main(String[] args) {
        //自顶向下会有冗余计算，自底向上提前阻断更好
    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static class Solution {
        public boolean isBalanced(TreeNode root) {
            if(root==null)return true;
            return Math.abs(depth(root.left,0)-depth(root.right,0))<=1&&isBalanced(root.left)&&isBalanced(root.right);
        }
        public int depth(TreeNode r,int index)
        {
            if(r==null)return index;
            else return Math.max(depth(r.left,index+1),depth(r.right,index+1));
        }
    }
}
