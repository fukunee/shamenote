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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
            return new TreeNode(val);
        if(val>root.val){
            if(root.right!=null){
                insertIntoBST(root.right,val);
            }else
                root.right = new TreeNode(val);
        }
        else if(val<root.val){
            if(root.left!=null){
                insertIntoBST(root.left,val);
            }else
                root.left = new TreeNode(val);
        }

        return root;
    }
}