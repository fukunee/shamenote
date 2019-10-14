function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

var isBalanced = function (root) {
    const calHeight = function (node) {
        if (!node) return 0;
        let ll = calHeight(node.left),
            lr = calHeight(node.right);
        if (ll === false || lr === false) return false;
        if (Math.abs(ll - lr) >= 2) return false;
        return Math.max(ll, lr) + 1;
    };
    return calHeight(root) !== false;
};


let t = new TreeNode(1);
t.left = new TreeNode(2);
t.right = new TreeNode(2);
console.log(isBalanced(t));