//返回与给定先序遍历 preorder 相匹配的二叉搜索树（binary search tree）的根结点。
//
// (回想一下，二叉搜索树是二叉树的一种，其每个节点都满足以下规则，对于 node.left 的任何后代，值总 < node.val，而 node.right 的任何后代，值总 > node.val。此外，先序遍历首先显示节点的值，然后遍历 node.left，接着遍历 node.right。） 
//
// 
//
// 示例： 
//
// 输入：[8,5,1,7,10,12]
//输出：[8,5,10,1,7,null,12]
//
// 
//
// 
//
// 提示： 
//
// 
// 1 <= preorder.length <= 100 
// 先序 preorder 中的值是不同的。 
// 
// Related Topics 树

package cn;

import sun.reflect.generics.tree.Tree;

public class ConstructBinarySearchTreeFromPreorderTraversal {
    public static void main(String[] args) {

        Solution solution = new ConstructBinarySearchTreeFromPreorderTraversal().new Solution();
    }


//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        TreeNode ret;

        /**
         * 88%
         * @param preorder
         * @return
         */
        public TreeNode bstFromPreorder(int[] preorder) {
            if (preorder == null) return null;
            ret = new TreeNode(preorder[0]);
            for (int i = 1; i < preorder.length; i++) {
                TreeNode x = new TreeNode(preorder[i]);
                buildtree(x, ret);
            }
            return ret;
        }

        private void buildtree(TreeNode x, TreeNode root) {
            if (root.val > x.val) {
                if (root.left == null) {
                    root.left = x;
                    return;
                } else
                    buildtree(x, root.left);

            }
            if (root.val < x.val) {
                if (root.right == null) {
                    root.right = x;
                    return;
                }
                else buildtree(x, root.right);
            }
            return;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}