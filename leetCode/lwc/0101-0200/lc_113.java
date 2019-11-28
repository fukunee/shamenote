package solution2;

import java.util.*;

/**
 * @author lwc
 * @date 2019/10/28 23:23
 */
public class U113 {

    // 6 java faster
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> rs = new LinkedList<>();
        if(root == null) return rs;

        if(root.left == null && root.right == null && root.val == sum) {
            rs.add(new ArrayList<>(Arrays.asList(root.val)));
            return rs;
        }

        rs = pathSum(root.left,sum - root.val);
        rs.addAll(pathSum(root.right,sum - root.val));

        for(List<Integer> tempList : rs) {
            tempList.add(root.val);
        }
        return rs;
    }
}
