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
    
    
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        func(root,list);
        
        TreeNode head = new TreeNode(0);
        TreeNode q = head;
        for(int i=0;i<list.size();i++){
            q.right=new TreeNode(list.get(i));
            q=q.right;
        }
        return head.right;
    }
    
    public void func(TreeNode root,List<Integer> list){
        if(root==null)
            return;
        
        func(root.left,list);
        
        list.add(root.val);
            
        func(root.right,list);
        
        
    }
}