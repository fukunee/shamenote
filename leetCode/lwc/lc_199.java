package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/17 22:21
 */
public class lc_199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();
        view(rs, root, 0);
        List<Integer> res = new ArrayList<>();
        for(List<Integer> list : rs){
            res.add(list.get(list.size() - 1));
        }
        return res;
    }

    public void view(List<List<Integer>> rs, TreeNode root, int level){
        if(root == null) return;
        if(rs.size() == level) rs.add(new ArrayList<>());
        rs.get(level).add(root.val);
        view(rs, root.left, level + 1);
        view(rs, root.right, level + 1);

    }
}
