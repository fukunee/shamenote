public class lc_111 {
    public static void main(String[] args) {

    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static class Solution {
        public int minDepth(TreeNode root) {
            return depth(root,0);
        }
        public int depth(TreeNode r,int index)
        {
            if(r==null)return index;
            else if(r.left==null&&r.right==null) return index+1;
            else if(r.left==null)return depth(r.right,index+1);
            else if(r.right==null)return depth(r.left,index+1);
            else return Math.min(depth(r.left,index+1),depth(r.right,index+1));
        }
    }
}
