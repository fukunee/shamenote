/*Binary Tree Preorder Traversal*/
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(root == null){
            return list;
        }
            
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right != null)
                stack.push(node.right);
            if(node.left != null) 
                stack.push(node.left);
        }
        return list;
    }
}