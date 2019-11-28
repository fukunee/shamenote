package easy;
/*lc_429*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal {
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
    public static void main(String[] args){

    }
    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>> list = new ArrayList<>();

            if(root == null){
                return list;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                int sum = queue.size();
                List<Integer> temp = new ArrayList<>();
                while(sum > 0){
                    Node node = queue.poll();
                    temp.add(node.val);
                    for(Node tag :node.children){
                        if(tag != null){
                            queue.add(tag);
                        }
                    }



                    sum--;
                }
                list.add(temp);
            }
            return list;

        }
    }
}
