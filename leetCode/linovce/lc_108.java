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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;

        int f=0,l=nums.length-1;
        int mid = (f+l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = func(nums,f,mid-1);
        root.right = func(nums,mid+1,l);
        return root;
    }

    public TreeNode func(int[] nums,int f,int l){
        if(f>l){
            return null;
        }
        int mid = (f+l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = func(nums,f,mid-1);
        root.right = func(nums,mid+1,l);
        return root;
    }
}