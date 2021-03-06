//给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 保证原始二叉搜索树中不存在新值。
//
// 注意，可能存在多种有效的插入方式，只要树在插入后仍保持为二叉搜索树即可。 你可以返回任意有效的结果。 
//
// 例如, 
//
// 
//给定二叉搜索树:
//
//        4
//       / \
//      2   7
//     / \
//    1   3
//
//和 插入的值: 5
// 
//
// 你可以返回这个二叉搜索树: 
//
// 
//         4
//       /   \
//      2     7
//     / \   /
//    1   3 5
// 
//
// 或者这个树也是有效的: 
//
// 
//         5
//       /   \
//      2     7
//     / \   
//    1   3
//         \
//          4
// 
// Related Topics 树

package cn;

public class InsertIntoABinarySearchTree {
    public static void main(String[] args) {

        Solution solution = new InsertIntoABinarySearchTree().new Solution();
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

        public TreeNode insertIntoBST(TreeNode root, int val) {
            /**
             * 100%
             */
            TreeNode leaf = new TreeNode(val);
            getree(root, leaf);
            return root;
        }

        private void getree(TreeNode root, TreeNode leaf) {
            if (root.val > leaf.val) {
                if (root.left == null) {
                    root.left = leaf;
                    return;
                } else getree(root.left, leaf);
            }
            if (root.val < leaf.val) {
                if (root.right == null) {
                    root.right = leaf;
                    return;
                } else getree(root.right, leaf);
            }
            return;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}