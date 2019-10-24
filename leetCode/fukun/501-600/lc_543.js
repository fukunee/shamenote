var diameterOfBinaryTree = function (root) {
    let diameter = 0;
    const helper = function (node) {
        if (!node) return [-1, -1];
        let op = [Math.max(...helper(node.left)) + 1, Math.max(...helper(node.right)) + 1];
        diameter = Math.max(diameter, op[0] + op[1]);
        return op;
    };
    helper(root);
    return diameter;
};
