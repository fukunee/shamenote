package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/30 20:14
 */
public class U129 {
    public int sumNumbers(TreeNode root) {
        return recursive(root,0);
    }

    public int recursive(TreeNode root, int s){
        if(root == null) return 0;
        s = s*10 + root.val;
        if(root.left == null && root.right == null) return s;
        return recursive(root.left,s) + recursive(root.right,s);
    }
}
