package solution2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/7 9:28
 */
public class U145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> rs = new LinkedList<>();
        LinkedList<TreeNode> left = new LinkedList<>();
        LinkedList<TreeNode> right = new LinkedList<>();

        if(root == null) return rs;
        right.push(root);

        while(!left.isEmpty() || !right.isEmpty()){
            TreeNode node;
            if(!right.isEmpty()) node = right.pop();
            else node = left.pop();
            rs.add(0,node.val);
            if(node.left != null) left.push(node.left);
            if(node.right != null) right.push(node.right);
        }
        return rs;
    }
}
