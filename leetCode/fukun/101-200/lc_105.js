function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

var buildTree = function (preorder, inorder) {
    if (preorder.length === 0) return null;
    const helper = function (node, l, r) {
        for (let i = 0; i < preorder.length; i++) {
            for (let j = l; j <= r; j++) {
                if (preorder[i] === inorder[j]) {
                    node.val = preorder[i];
                    preorder.splice(i, 1);
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

console.log(buildTree([3, 9, 20, 15, 7], [9, 3, 15, 20, 7]));