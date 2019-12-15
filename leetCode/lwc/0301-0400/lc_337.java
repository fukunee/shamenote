package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwc
 * @date 2019/12/9 10:43
 */
public class lc_337 {
    public int rob(TreeNode root) {
        return help(root, new HashMap<>());
    }

    public int help(TreeNode root, Map<TreeNode,Integer> map){
        if(root == null) return 0;

        if(!map.containsKey(root)) {
            TreeNode left = root.left, right = root.right;
            int v2 = help(left, map) + help(right, map);

            int v1 = root.val;
            if (left != null) v1 = v1 + help(left.left, map) + help(left.right, map);
            if (right != null) v1 = v1 + help(right.left, map) + help(right.right, map);

            map.put(root, Math.max(v1, v2));
        }

        return map.get(root);
    }


    /** 动态规划
    public int rob(TreeNode root) {
        int[] result = robInternal(root);
        return Math.max(result[0], result[1]);
    }

    public int[] robInternal(TreeNode root) {
        if (root == null) return new int[2];
        int[] result = new int[2];

        int[] left = robInternal(root.left);
        int[] right = robInternal(root.right);

        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        result[1] = left[0] + right[0] + root.val;

        return result;
    }
     */
}
