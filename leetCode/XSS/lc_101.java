import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lc_101 {
    public static void main(String[] args) {
        //对称二叉树，中序遍历能解决，但遇到null值不好加入list中
    }

      public class TreeNode {
          int val;
         TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }//3241423
    static class Solution {
        public boolean isSymmetric(TreeNode root) {
            return isMirror(root, root);
        }

        public boolean isMirror(TreeNode t1, TreeNode t2) {
            if (t1 == null && t2 == null) return true;
            if (t1 == null || t2 == null) return false;
            return (t1.val == t2.val)
                    && isMirror(t1.right, t2.left)
                    && isMirror(t1.left, t2.right);
        }
        /*public boolean isSymmetric(TreeNode root) {
            List<Integer> list=new ArrayList<>();
            fun(root,list);
            Integer []a=new Integer[list.size()];
            list.toArray(a);
            int i=0,j=a.length;
            while (i<=j)
            {
                if(a[i++]!=a[j--])
                {
                    return false;
                }
            }
            return true;
        }
        public void fun(TreeNode r,List l)
        {
            if(r==null)
            { l.add(-1);
            return;
            }
            fun(r.left,l);
            l.add(r.val);
            fun(r.right,l);

        }*/
    }
}
