//给定一个 N 叉树，返回其节点值的前序遍历。
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树

package cn;

import java.util.ArrayList;
import java.util.List;

public class NAryTreePreorderTraversal {
    public static void main(String[] args) {

        Solution solution = new NAryTreePreorderTraversal().new Solution();
        Node root = new Node();
        root.val = 1;
        Node n1 = new Node();
        n1.val = 3;
        Node n2 = new Node();
        n2.val = 2;
        Node n3 = new Node();
        n3.val = 4;
        Node n5 = new Node();
        n5.val = 5;
        Node n6 = new Node();
        n6.val = 6;
        List<Node> list = new ArrayList<Node>() {{
            add(n1);
            add(n2);
            add(n3);
        }};
        root.children = list;
        solution.preorder(root);
    }


//leetcode submit region begin(Prohibit modification and deletion)

    // Definition for a Node.
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }


    class Solution {
        List<Integer> ret = new ArrayList<>();

        public List<Integer> preorder(Node root) {
            /**
             * 100%
             */
            pre(root);
            return ret;
        }

        private void pre(Node root) {
            if(root == null) return ;
            ret.add(root.val);
            //System.out.println(root.val);
            if (root.children != null)
                for (Node node : root.children)
                    pre(node);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}