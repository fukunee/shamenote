package solution2;

import java.util.*;

/**
 * @author lwc
 * @date 2019/11/3 14:20
 */
public class U133 {
    public Node cloneGraph(Node node) {
        Node clone = new Node(node.val,new ArrayList<>());
        Map<Integer, Node> map = new HashMap<>();
        map.put(node.val,clone);
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node n = queue.pop();
            Node newNode = map.get(n.val);
            for (Node neighbor : n.neighbors) {
                if (!map.containsKey(neighbor.val)) {
                    map.put(neighbor.val, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);
                }
                newNode.neighbors.add(map.get(neighbor.val));
            }
        }
        return clone;
    }


    private HashMap<Integer, Node> map = new HashMap<>();
    public Node cloneGraph2(Node node) {
        return clone(node);
    }

    private Node clone(Node node) {
        if (node == null) return null;

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }
        Node clone = new Node(node.val,new ArrayList<>());
        map.put(clone.val, clone);
        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(clone(neighbor));
        }
        return clone;
    }
}
