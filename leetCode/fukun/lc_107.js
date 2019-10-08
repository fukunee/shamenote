function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

const levelOrderBottom = function (root) {
    let output = [];
    const doPush = function (node, level) {
        if (node === null) return;
        output[level] ? output[level].push(node.val) : output.push([node.val]);
        doPush(node.left, level + 1);
        doPush(node.right, level + 1);
    };
    doPush(root, 0);
    return output.reverse();
};

let t = new TreeNode(1);
t.left = new TreeNode(2);
t.right = new TreeNode(2);

console.log(levelOrderBottom(t));