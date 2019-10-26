//给定一个二叉树，检查它是否是镜像对称的。
//
// 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。 
//
//     1
//   / \
//  2   2
// / \ / \
//3  4 4  3
// 
//
// 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的: 
//
//     1
//   / \
//  2   2
//   \   \
//   3    3
// 
//
// 说明: 
//
// 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。 
// Related Topics 树 深度优先搜索 广度优先搜索

package cn;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {
    public static void main(String[] args) {

        Solution solution = new SymmetricTree().new Solution();
    }


//leetcode submit region begin(Prohibit modification and deletion)


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            /**
             * 41% 迭代的时间，下面尝试用递归做
             */
            /*
            if (root == null) return true;
            Queue<TreeNode> list = new LinkedList<>();
            TreeNode a, b;
            list.add(root);
            list.add(root);
            while (list.size() > 0) {
                a = list.poll();
                b = list.poll();
                if (a == null && b == null) continue;
                else if (a == null || b == null) return false;
                if (a.val != b.val) return false;
                list.add(a.left);
                list.add(b.right);
                list.add(a.right);
                list.add(b.left);
            }
            return true;

             */
            return isdtree(root, root);
        }

        /**
         * 98%
         * @param root1
         * @param root2
         * @return
         */
        public boolean isdtree(TreeNode root1, TreeNode root2){
            if(root1 == null && root2 == null) return true;
            else if(root1 == null || root2 == null) return false;
            if(root1.val != root2.val) return false;
            return (isdtree(root1.left, root2.right) && isdtree(root1.right, root2.left));
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}