package solution2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/28 10:23
 */
public class U107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> rs = new LinkedList<>();
        List<TreeNode> queue = new ArrayList<>();
        if(root == null) return rs;

        queue.add(root);
        int pos = 0;
        while(pos < queue.size()){
            List<Integer> tempList = new ArrayList<>();
            int len = queue.size();
            while(pos < len){
                TreeNode curNode = queue.get(pos);
                tempList.add(curNode.val);
                if(curNode.left != null) queue.add(curNode.left);
                if(curNode.right != null) queue.add(curNode.right);
                pos++;
            }
            rs.add(0,tempList);
        }
        return rs;
    }
}
