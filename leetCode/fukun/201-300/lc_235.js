var lowestCommonAncestor = function (root, p, q) {
    let left = Math.min(p.val, q.val);
    let right = Math.max(p.val, q.val);
    const helper = function (node) {
        if (!node) return false;
        if (node.val < left) {
            return helper(node.right);
        }
        if (node.val > right) {
            return helper(node.left);
        }
        return node;
    }
    return helper(root);
};