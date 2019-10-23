var invertTree = function (root) {
    const helper = function (node) {
        if (!node) return;
        if (node.left || node.right) [node.left, node.right] = [node.right, node.left];
        helper(node.left);
        helper(node.right);
    };
    helper(root);
    return root;
};