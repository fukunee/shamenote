var kthSmallest = function (root, k) {
    let n = 0;
    const helper = function (node) {
        if (!node) return;
        let l = helper(node.left)
        if (l || l === 0) return l;
        n++;
        if (n === k) return node.val;
        let r = helper(node.right);
        if (r || r === 0) return r;
    }
    return helper(root);
};