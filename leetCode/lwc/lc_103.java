package solution2;

import java.util.*;

/**
 * @author lwc
 * @date 2019/10/26 14:05
 */
public class U103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> rs = new ArrayList<>();
        if (root == null) return rs;

        List<TreeNode> list = new ArrayList<>(Arrays.asList(root));
        int start = 0;
        int flag = 0;
        while (start < list.size()) {
            int length = list.size();
            List<Integer> temp = new ArrayList<>();
            while (start < length) {
                TreeNode node = list.get(start);
                if (node.left != null) list.add(node.left);
                if (node.right != null) list.add(node.right);
                if(flag == 1) temp.add(0,node.val);
                else temp.add(node.val);
                start++;
            }
            rs.add(temp);
            flag = flag ^ 1;
        }
        return rs;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        System.out.println(new U103().zigzagLevelOrder(treeNode));
    }
}
