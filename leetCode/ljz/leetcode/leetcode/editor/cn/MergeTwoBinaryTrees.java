//给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
//
// 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。 
//
// 示例 1: 
//
// 
//输入: 
//	Tree 1                     Tree 2                  
//          1                         2                             
//         / \                       / \                            
//        3   2                     1   3                        
//       /                           \   \                      
//      5                             4   7                  
//输出: 
//合并后的树:
//	     3
//	    / \
//	   4   5
//	  / \   \ 
//	 5   4   7
// 
//
// 注意: 合并必须从两个树的根节点开始。 
// Related Topics 树

package cn;

import java.util.Stack;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {

        Solution solution = new MergeTwoBinaryTrees().new Solution();
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(1);
        TreeNode m = a, n = b;
        a.left = new TreeNode(1);
        a.right = new TreeNode(1);
//        a.left = new TreeNode(3);
//        a.right = new TreeNode(2);
//        a = a.left;
//        a.left = new TreeNode(5);
//        b.left = new TreeNode(1);
//        b.right = new TreeNode(3);
//        TreeNode c = b.left;
//        c.right = new TreeNode(4);
//        b = b.right;
//        b.right = new TreeNode(7);
        solution.mergeTrees(m, n);
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
        //先序遍历，非递归，要保证两棵树点对应

        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            /**
             * 11%我干，我还写了好久
             **/
            /*
            if(t1 == null) return t2;
            if(t2 == null) return t1;
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            TreeNode ret = t1;
            //先往左易一直读，每读到一个点，就比较是不是两棵树都有，是的话，sum = t1.val+t2.val
            //会出现以下情况：1. t1和t2最左下角点都有  2.t1或者t2没到另一棵树的最左下角就没了
            //针对2，先遍历多的树的那一部分，
            while ((!s1.empty() || t1 != null) && (!s2.empty() || t2 != null)) {
                while (t1 != null && t2 != null) {
                    s1.push(t1);
                    s2.push(t2);
                    t1.val += t2.val;
                    t1 = t1.left;
                    t2 = t2.left;
                }
                if (!s1.empty() && !s2.empty()) {
                    if (t1 == null && t2 != null) {
                        t1 = s1.pop();
                        t1.left = t2;
                    } else
                        t1 = s1.pop();
                    t2 = s2.pop();
                    while (t1.right == null && t2.right != null) {
                        if (s1.empty()) {
                            t1.right = t2.right;
                            return ret;
                        }
                        t1.right = t2.right;
                        if (!s1.empty())
                            t1 = s1.pop();
                        if (!s2.empty())
                            t2 = s2.pop();
                    }
                    t1 = t1.right;
                    t2 = t2.right;
                }
            }
            return ret;

             */
            /**
             * 官方给的递归代码，99%，人没了
             */
            /*
            if (t1 == null)
                return t2;
            if (t2 == null)
                return t1;
            t1.val += t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            return t1;

             */
            /**
             * 模仿题解的迭代 11.7%，我试试用题解的迭代交是多少，官方的也是这个效率
             * 想不通为什么 迭代的时间还要多一些，去查查迭代和递归的效率关系
             */
            if (t1 == null) return t2;
            if (t2 == null) return t1;
            Stack<TreeNode[]> s1 = new Stack<>();
            TreeNode ret = t1;
            //先往左易一直读，每读到一个点，就比较是不是两棵树都有，是的话，sum = t1.val+t2.val
            //会出现以下情况：1. t1和t2最左下角点都有  2.t1或者t2没到另一棵树的最左下角就没了
            //针对2，先遍历多的树的那一部分，
            while (!s1.empty() || (t1 != null && t2 != null)) {
                while (t1 != null && t2 != null) {
                    s1.push(new TreeNode[]{t1, t2});
                    t1.val += t2.val;
                    t1 = t1.left;
                    t2 = t2.left;
                }
                if (!s1.empty()) {
                    if (t1 == null && t2 != null) {
                        t1 = s1.peek()[0];
                        t1.left = t2;
                    } else
                        t1 = s1.peek()[0];
                    t2 = s1.pop()[1];
                    while (t1.right == null && t2.right != null) {
                        if (s1.empty()) {
                            t1.right = t2.right;
                            return ret;
                        }
                        t1.right = t2.right;
                        if (!s1.empty()) {
                            t1 = s1.peek()[0];
                            t2 = s1.pop()[1];
                        }
                    }
                    t1 = t1.right;
                    t2 = t2.right;
                }
            }
            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}