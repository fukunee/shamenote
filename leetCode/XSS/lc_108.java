import java.util.Arrays;

public class lc_108 {
    public static void main(String[] args) {

    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            int n=nums.length;
            if(n==0)return null;
            int mid=n/2;
            TreeNode root=new TreeNode(nums[mid]);
            if(mid>0) root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
            else root.left=null;
            if(mid<n-1)root.right=sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,n));
            else root.right=null;
            return root;
        }
    }
}
