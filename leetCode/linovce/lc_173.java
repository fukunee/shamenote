/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    List<Integer> list = new ArrayList<>();;
    public BSTIterator(TreeNode root) {
        func(root);
    }
    
    public void func(TreeNode root){
        if(root==null)
            return;
        
        func(root.left);
        list.add(root.val);
        func(root.right);
    }
    
    /** @return the next smallest number */
    public int next() {
        return list.remove(0);
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(list.size()==0)
            return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */