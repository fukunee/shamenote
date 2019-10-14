function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

const minDepth = function (root) {
    const helper = function (node, depth) {
        if (!node.left && !node.right) return depth;
        return Math.min(node.left ? helper(node.left, depth + 1) : Infinity, node.right ? helper(node.right, depth + 1) : Infinity);
    };
    if (!root) return 0;
    return helper(root, 1);
};

let t = new TreeNode(1);
t.left = new TreeNode(2);
t.right = new TreeNode(2);
console.log(minDepth(t));