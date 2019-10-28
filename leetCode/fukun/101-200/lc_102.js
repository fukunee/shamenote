var levelOrder = function (root) {
    const helper = function (node, l) {
        if (!node) return;
        output[l] ? output[l].push(node.val) : output[l] = [node.val];
        helper(node.left, l + 1);
        helper(node.right, l + 1);
    };
    let output = [];
    helper(root, 0);
    return output;
};
