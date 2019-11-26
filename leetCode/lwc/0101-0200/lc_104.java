package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/26 15:49
 */
public class U104 {
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        else
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
