/*Balanced Binary Tree*/
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
    public class Node{
        boolean istrue;
        int depth;
        
        public Node(boolean istrue,int depth){
            this.istrue = istrue;
            this.depth = depth;
        }
    }
    
    public boolean isBalanced(TreeNode root) {
        return findbalance(root).istrue;
    }
    
    public Node findbalance(TreeNode root){
        if(root == null){
            return new Node(true,0);
        }
        
        Node left = findbalance(root.left);
        Node right = findbalance(root.right);
        
        if(left.istrue == false || right.istrue == false){
            return new Node(false,0);
        }
        if(Math.abs(left.depth - right.depth) > 1){
            return new Node(false,0);
        }
        
        return new Node(true,Math.max(left.depth,right.depth) + 1);
    }
}