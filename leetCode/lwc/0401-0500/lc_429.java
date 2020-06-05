package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2020/1/2 11:14
 */
public class lc_429 {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> rs = new ArrayList<>();
        help(rs, root, 0);
        return rs;
    }

    public void help(List<List<Integer>> rs, Node root, int level){
        if(root != null) {
            if(rs.size() == level) {
                rs.add(new ArrayList<>());
            }
            rs.get(level).add(root.val);
            for (Node node : root.children) {
                help(rs, node, level + 1);
            }
        }
    }
}
