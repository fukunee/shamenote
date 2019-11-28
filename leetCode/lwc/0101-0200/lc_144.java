package solution2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author lwc
 * @date 2019/11/6 20:20
 */
public class U144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> rs = new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node != null){
                rs.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return rs;
    }
}
