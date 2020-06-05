package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author lwc
 * @date 2020/1/13 10:42
 */
public class lc_449 {
    public class Codec {
        public int i = 0;

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            doSerialize(root, sb);
            return sb.toString();
        }

        public void doSerialize(TreeNode root, StringBuilder sb) {
            if (root == null) {
                return;
            }
            sb.append((char) root.val);
            doSerialize(root.left, sb);
            doSerialize(root.right, sb);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            char[] arr = data.toCharArray();
            return doDeserialize(arr, Integer.MAX_VALUE);
        }

        private TreeNode doDeserialize(char[] arr,int maxValue) {
            if (i >= arr.length || (char) arr[i] > maxValue) {
                return null;
            }
            TreeNode root = new TreeNode((char) arr[i++]);
            root.left = doDeserialize(arr,root.val);
            root.right = doDeserialize(arr, maxValue);
            return root;
        }
    }

}
