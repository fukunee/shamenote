import java.util.*;

public class lc_107 {
    public static void main(String[] args) {

    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Deque<TreeNode> queue=new LinkedList<>();
            List<List<Integer>> res=new ArrayList<>();
            Stack<List<Integer>> stack=new Stack<>();
            if(root!=null) queue.offer(root);
            else return res;
            TreeNode end=root;
            List<Integer> list=new ArrayList<>();
            TreeNode last=null;
            while(!queue.isEmpty())
            {
                TreeNode p=queue.poll();
                list.add(p.val);
                if(p.left!=null)
                {
                    queue.offer(p.left);
                    last=p.left;
                }
                if(p.right!=null)
                {
                    queue.offer(p.right);
                    last=p.right;
                }
                if(p==end)
                {
                    end=last;
                    stack.push(list);
                    list=new ArrayList<>();
                }
            }
            while(!stack.empty())
            {
                res.add(stack.pop());
            }
            return res;
        }
    }
}
