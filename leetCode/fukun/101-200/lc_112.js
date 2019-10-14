function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

var hasPathSum = function (root, sum) {
    const helper = function (node, add) {
        if (!node) return false;
        if (!node.left && !node.right && node.val + add === sum) return true;
        return helper(node.left, add + node.val) || helper(node.right, add + node.val);
    }
    return helper(root, 0);
};

let t = new TreeNode(1);
t.left = new TreeNode(2);
t.right = new TreeNode(3);
console.log(hasPathSum(t, 2));