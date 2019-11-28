/*Binary Tree Zigzag Level Order Traversal*/
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int tag = 0;
        while(!queue.isEmpty()){
            int sum = queue.size();
            tag++;
            LinkedList<Integer> temp = new LinkedList<>();
            while(sum > 0){
                TreeNode node = queue.poll();
                if(tag % 2 == 0){
                    temp.addFirst(node.val);
                }else{
                    temp.add(node.val);
                }
                
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                sum--;
            }
            list.add(temp);
        }
        return list;
    }
}