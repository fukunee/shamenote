import java.util.*;

public class lc_429 {
    public static void main(String[] args) {

    }
// Definition for a Node.
static class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
    class Solution {
        public List<List<Integer>> levelOrder(Node root) {
            Deque<Node> queue= new LinkedList<>();
            List<List<Integer>> res=new ArrayList<List<Integer>>();
            List<Integer> temp=new ArrayList<>();
            queue.offer(root);
            int  leaf=1;int num=0;int see=1;
            while (!queue.isEmpty()) {
                Node p = queue.poll();
                if (p != null) {
                    temp.add(p.val);
                    num++;
                    for (Node node : p.children) {
                        queue.offer(node);
                        see++;
                    }
                    if (leaf == num) {
                        for(int i=0;i<temp.size();i++)
                        {
                            System.out.print(temp.get(i));
                            System.out.print("  ");
                        }
                        res.add(temp);
                        temp=new ArrayList<>();
                        leaf = see;
                    }
                }
            }
            return res;
        }
    }

}
