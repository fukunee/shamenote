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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return func(nums,0,nums.length-1);
    }
    
    public TreeNode func(int[] nums,int f,int l){
        int i = getMax(nums,f,l);
        int t = nums[i];
        TreeNode root = new TreeNode(t);
        
        if(i>f){
            root.left = (func(nums,f,i-1));
        }else
            root.left = null;
        
        if(i<l){
            root.right = (func(nums,i+1,l));
        }else
            root.right = null;
        
        return root;
        
    }
    
    public int getMax(int[] nums,int f,int l){
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=f;i<=l;i++){
            if(max<=nums[i]){
                max=nums[i];
                index=i;
            }
        }
        return index;            
    }
}