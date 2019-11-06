/*Minimum Diatance Between BST Nodes*/
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
    
    private List<Integer> list = new ArrayList<>();
    
    public int minDiffInBST(TreeNode root) {
        if(root == null){
            return 0;
        }
        inorderTraversal(root);
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0;i < list.size() - 1;i++){
            min = Math.min(Math.abs(list.get(i) - list.get(i + 1)),min);
        }
        return min;
    }
    public void inorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
    }
}