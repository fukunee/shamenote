/*Binary Tree Level Order Traversall II*/
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       LinkedList<List<Integer>> list = new LinkedList<>();
        
        if(root == null){
            return list;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int sum = queue.size();
            List<Integer> temp = new ArrayList<>();
            while(sum > 0){
                TreeNode node = queue.poll();
                temp.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                sum--;
            }
            list.addFirst(temp);
        }
        return list; 
    }
}