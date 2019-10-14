function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

const maxDepth = function (root) {
    if (!root) return 0;
    if (!root.left && !root.right) return 1;
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
};

let t = new TreeNode(1);
t.left = new TreeNode(2);
t.right = new TreeNode(2);

console.log(maxDepth(t));