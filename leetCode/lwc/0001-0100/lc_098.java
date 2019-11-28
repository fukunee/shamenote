package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/26 23:29
 */
public class U98 {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return recursive(root,new ArrayList<>()) == 1;
    }

    public int recursive(TreeNode root, List<Integer> v) {
        int flag = 1;
        if(root.left != null) flag &= recursive(root.left, v);
        if (!v.isEmpty() && root.val <= v.get(v.size()-1)) return 0;
        v.add(root.val);
        if(root.right != null) flag &= recursive(root.right, v);

        return flag;
    }

    public static void main(String[] args) {
        new U98().isValidBST(new TreeNode(0));
    }
}
