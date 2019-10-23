var isValidBST = function (root) {
    const helper = function (node, tl, tr) {
        if (!node) return true;
        return (!node.left || (node.left.val > tl && node.left.val < node.val))
        && (!node.right || (node.right.val < tr && node.right.val > node.val))
            ? helper(node.left, tl, node.val) && helper(node.right, node.val, tr) : false;
    };
    return helper(root, -Infinity, Infinity);
};