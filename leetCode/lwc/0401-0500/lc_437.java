package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2020/1/3 11:06
 */
public class lc_437 {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return help(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    public int help(TreeNode root, int sum){
        if(root == null) return 0;
        int res = 0;
        if(root.val == sum){
            res += 1;
        }
        return res + help(root.left, sum - root.val) + help(root.right, sum - root.val);
    }
}
