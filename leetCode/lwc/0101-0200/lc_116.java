package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/29 13:28
 */
public class U116 {
    public Node connect(Node root) {
        recursive(root,0,new ArrayList<>());
        return root;
    }

    public void recursive(Node root, int level, List<Node> tempList){
        if(level == tempList.size())
            tempList.add(null);
        if(root == null) return;
        Node cur = tempList.get(level);
        if(cur != null) cur.next = root;
        tempList.set(level,root);
        recursive(root.left,level + 1, tempList);
        recursive(root.right,level + 1, tempList);

    }
}
