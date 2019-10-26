var buildTree = function (inorder, postorder) {
    if (postorder.length === 0) return null;
    postorder.reverse();
    const helper = function (node, l, r) {
        for (let i = 0; i < postorder.length; i++) {
            for (let j = l; j <= r; j++) {
                if (postorder[i] === inorder[j]) {
                    node.val = postorder[i];
                    postorder.splice(i, 1);
                    l <= j - 1 ? helper(node.left = new TreeNode(null), l, j - 1) : null;
                    j + 1 <= r ? helper(node.right = new TreeNode(null), j + 1, r) : null;
                    break;
                }
            }
        }
    };
    let root = new TreeNode(null);
    helper(root, 0, inorder.length - 1);
    return root;
};
