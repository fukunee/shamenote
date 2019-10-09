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
    
    public boolean isUnivalTree(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        
        int n = root.val;
        if(root.left!=null)
            queue.offer(root.left);
        if(root.right!=null)
            queue.offer(root.right);
        while(queue.peek()!=null){
            TreeNode t = queue.poll();
            if(n==t.val){
                if(t.left!=null)
                    queue.offer(t.left);
                if(t.right!=null)
                    queue.offer(t.right);
            }
            else
                return false;
        }
        return true;
    }
    
}