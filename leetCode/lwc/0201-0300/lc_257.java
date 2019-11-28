package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/26 19:49
 */
public class lc_257 {
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        if(root.left == null && root.right == null)
            return Arrays.asList(root.val+"");
        List<String> rs = new ArrayList<>();
        for(String left : binaryTreePaths(root.left)){
            rs.add(root.val + "->" + left);
        }
        for(String right : binaryTreePaths(root.right)){
            rs.add(root.val + "->" +right);
        }
        return rs;
    }
}
