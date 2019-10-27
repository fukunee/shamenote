package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/23 17:33
 */
public class U95 {
    public List<TreeNode> generateTrees2(int n) {
        if(n == 0) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        return recursive(list);
    }

    public List<TreeNode> recursive(List<Integer> list){
        ArrayList<TreeNode> rs = new ArrayList<>();

        int size = list.size();
        if(size < 2)
            rs.add(size == 0 ? null : new TreeNode(list.get(0)));

        else {
            for (int k = 0; k < size; k++) {
                List<TreeNode> left = recursive(list.subList(0,k));
                List<TreeNode> right = recursive(list.subList(k+1,size));
                for (int i = 0; i < left.size(); i++) {
                    for (int j = 0; j < right.size(); j++) {
                        TreeNode root = new TreeNode(list.get(k));
                        root.left = left.get(i);
                        root.right = right.get(j);
                        rs.add(root);
                    }
                }
            }
        }
        return rs;
    }


    public List<TreeNode> generateTrees(int n) {

        List<TreeNode>[] v = new ArrayList[n+1];
        v[0] = new ArrayList<TreeNode>();
        if(n == 0) return v[0];

        v[0].add(null);
        for(int i = 1; i <= n; i++){
            List<TreeNode> tempList = new ArrayList<>();
            for(int j = 1; j <= i; j++) {
                List<TreeNode> left = v[j - 1], right = v[i-j];
                for(TreeNode lNode : left){
                    for(TreeNode rNode : right){
                        TreeNode root = new TreeNode(j);
                        root.left = lNode;
                        root.right = cloneTree(rNode,j);
                        tempList.add(root);
                    }
                }
            }
            v[i] = tempList;
        }

        return v[n];
    }

    public TreeNode cloneTree(TreeNode root, int pos){
        if(root == null) return null;
        TreeNode newNode = new TreeNode(root.val + pos);
        newNode.left = cloneTree(root.left, pos);
        newNode.right = cloneTree(root.right, pos);
        return newNode;
    }
}
