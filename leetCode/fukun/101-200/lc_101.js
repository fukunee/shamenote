function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

const isSymmetric = function (root) {
    const isSymmetric = function (p, q) {
        if (!p && !q) return true;
        if (!q || !p || q.val !== p.val) return false;
        return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    };
    return root ? isSymmetric(root.left, root.right) : true;
};

let t = new TreeNode(1);
t.left = new TreeNode(2);
t.right = new TreeNode(2);

console.log(isSymmetric(t));