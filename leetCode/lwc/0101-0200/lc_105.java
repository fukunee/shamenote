package solution2;

import java.util.Arrays;

/**
 * @author lwc
 * @date 2019/10/26 15:58
 */
public class U105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        if(preorder.length == 1) return root;


        int pos = 0;
        while(inorder[pos] != preorder[0]){
            pos++;
        }

        int[] linorder = Arrays.copyOfRange(inorder,0,pos);
        root.left = buildTree(Arrays.copyOfRange(preorder,1,1+linorder.length),linorder);
        int[] rinorder = Arrays.copyOfRange(inorder,pos+1,inorder.length);
        root.right = buildTree(Arrays.copyOfRange(preorder,1+linorder.length,preorder.length),rinorder);
        return root;
    }

    public TreeNode buildTree2(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;

        TreeNode[] v = new TreeNode[preorder.length];
        int i = 1, j = 0, pos = 0;
        v[0] = new TreeNode(preorder[0]);
        TreeNode rs = v[0];

        while(i < preorder.length){
            while(pos >= 0 && j < inorder.length && inorder[j] == v[pos].val){
                j ++;
                pos --;
            }
            TreeNode cur = new TreeNode(preorder[i++]);
            if(j > 0 && v[pos+1]!= null && inorder[j-1] == v[pos+1].val){
                TreeNode root = v[pos+1];
                root.right = cur;
            }
            else{
                TreeNode root = v[pos];
                root.left = cur;
            }
            v[++pos] = cur;
        }
        return rs;
    }


    public static void main(String[] args) {
        System.out.println(new U105().buildTree2(new int[]{1,2,3},new int[]{1,3,2}));
    }
}
