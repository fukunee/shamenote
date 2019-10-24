function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

var generateTrees = function (n) {
    // 二叉树遍历函数
    const helper = function (node, v) {
        if (!node) return;
        node.val += v;
        helper(node.left, v);
        helper(node.right, v);
    };
    if (n === 0) return [];
    let dp = [];
    dp[0] = [null];
    dp[1] = [new TreeNode(1)];
    for (let i = 2; i <= n; i++) {
        dp[i] = [];
        for (let j = 1; j <= i; j++) {
            dp[j - 1].forEach(vl => {
                dp[i - j].forEach(vr => {
                    let root = new TreeNode(j);
                    root.left = vl;
                    root.right = JSON.parse(JSON.stringify(vr));
                    helper(root.right, j);
                    dp[i].push(root);
                })
            });
        }
    }
    return dp[n];
};
console.log(generateTrees(3));