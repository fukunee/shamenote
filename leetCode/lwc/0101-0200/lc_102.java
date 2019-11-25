package solution2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/26 13:38
 */
public class U102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();
        if (root == null) return rs;

        List<TreeNode> list = new ArrayList(Arrays.asList(root));
        int start = 0;
        while (start < list.size()) {
            int length = list.size();
            List<Integer> temp = new ArrayList<>();
            while (start < length) {
                TreeNode node = list.get(start);
                temp.add(node.val);
                if (node.left != null) list.add(node.left);
                if (node.right != null) list.add(node.right);
                start++;
            }
            rs.add(temp);
        }
        return rs;
    }
}
