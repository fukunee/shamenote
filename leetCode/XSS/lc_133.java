import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc_133 {
    public static void main(String[] args) {
        //克隆图，深拷贝，遍历图
    }

// Definition for a Node.
static class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

    static class Solution {
        public Node cloneGraph(Node node)
        {
            Map<Node,Node> map=new HashMap<>();

            return fun(node,map);
        }
        public Node fun(Node node,Map<Node,Node> map)
        {
            if(node==null)return node;
            if(map.containsKey(node))return map.get(node);
            Node p=new Node();
            p.val=node.val;
            List<Node> neighbors=new ArrayList<>();
            map.put(node,p);
            if(node.neighbors.size()!=0)
            {
                for(int i=0;i<node.neighbors.size();i++)
                {
                    neighbors.add(fun(node.neighbors.get(i),map));
                }

            }
            p.neighbors=neighbors;
            return p;
        }
    }
}
