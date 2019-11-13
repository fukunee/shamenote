var lowestCommonAncestor = function (root, p, q) {
    let op = undefined;
    const helper = function (node) {
        if (!node) return false;
        let l = helper(node.left);
        let r = helper(node.right);
        if (!op && ((l && r) || ((l || r) && (node === p || node === q)))) op = node;
        if (node === p || node === q) return true;
        return l || r;
    }
    helper(root);
    return op;
};