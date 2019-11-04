package solution2;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/10/28 15:08
 */
public class U108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return recursive(nums,0,nums.length);
    }

    public TreeNode recursive(int[]nums, int start, int end){
        int len = end - start;
        if(len < 1) return null;
        if(len == 1) return new TreeNode(nums[start]);

        TreeNode root = new TreeNode(nums[(start+end)/2]);
        root.left = recursive(nums,start,(start+end)/2);
        root.right = recursive(nums,(start+end)/2 + 1,end);

        return root;
    }


    public TreeNode sortedArrayToBST2(int[] nums) {
        int len = nums.length;

        if(len == 0) return null;
        if(len == 1) return new TreeNode(nums[0]);

        TreeNode root = new TreeNode(nums[len/2]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,len/2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums,len/2 + 1,len));

        return root;
    }
}
