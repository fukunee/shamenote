/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode t = root;
        
        while(t!=null){
            if(t.val==p.val||t.val==q.val)
                return t;
            if(t.val>p.val&&t.val<q.val||t.val<p.val&&t.val>q.val)
                return t;
            
            else if(t.val>p.val&&t.val>q.val)
                t=t.left;
            else if(t.val<p.val&&t.val<q.val)
                t=t.right;
        }
        return t;
    }
}