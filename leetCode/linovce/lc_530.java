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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        func(root,list);
        Collections.sort(list);
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<list.size()-1;i++){
            if(min>list.get(i+1)-list.get(i))
                min=list.get(i+1)-list.get(i);
        }
        return min;
    }
    
    public void func(TreeNode root,List<Integer> list){
        if(root==null)
            return;
        list.add(root.val);
        func(root.left,list);
        func(root.right,list);
    }
}