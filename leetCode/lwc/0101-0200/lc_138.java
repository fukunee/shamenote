package solution2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lwc
 * @date 2019/11/4 9:18
 */
public class U138 {
    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    };

    public Node copyRandomList(Node head) {
        return recursive(head, new HashMap<>());
    }

    public Node recursive(Node root, Map<Integer,Node> map){
        if(root == null) return null;
        if(map.containsKey(root.val))
            return map.get(root.val);
        Node node = new Node(root.val,null,null);
        map.put(root.val,node);
        node.next = recursive(root.next, map);
        node.random = recursive(root.random, map);
        return node;
    }
}
