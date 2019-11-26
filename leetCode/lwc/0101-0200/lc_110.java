package solution2;

/**
 * @author lwc
 * @date 2019/10/28 21:40
 */
public class U110 {
    public boolean isBalanced(TreeNode root) {
        int[] v = new int[1];
        recursive(root,v);
        return v[0] != 1;
    }


    public int recursive(TreeNode root, int[] v){
        if(v[0] == 1) return 1;

        if(root == null) return 0;
        int left = recursive(root.left, v);
        int right = recursive(root.right, v);
        if(Math.abs(left - right) > 1)
            v[0] = 1;
        return Math.max(left,right) + 1;
    }
}
