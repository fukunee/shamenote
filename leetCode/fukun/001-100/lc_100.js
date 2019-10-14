function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

const isSameTree = function (p, q) {
    if (!p && !q) return true;
    if (!q || !p || q.val !== p.val) return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
};

let t1 = new TreeNode(1);
t1.left = new TreeNode(2);
t1.right = new TreeNode(3);

let t2 = new TreeNode(1);
t2.left = new TreeNode(2);
t2.right = new TreeNode(3);

console.log(isSameTree(t1, t2));