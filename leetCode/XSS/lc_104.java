public class lc_104 {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static class Solution {
        public int maxDepth(TreeNode root) {
            return depth(root,0);
        }
        public int depth(TreeNode r,int index)
        {
            if(r==null)return index;
            else return Math.max(depth(r.left,index+1),depth(r.right,index+1));
        }
    }
}
