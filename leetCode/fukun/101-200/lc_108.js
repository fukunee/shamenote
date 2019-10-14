function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

const sortedArrayToBST = function (nums) {
    const doGrow = function (l, r) {
        if (l > r) return null;
        let cut = l + Math.floor((r - l) / 2);
        let root = new TreeNode(nums[cut]);
        root.left = doGrow(l, cut - 1);
        root.right = doGrow(cut + 1, r);
        return root;
    };

    return doGrow(0, nums.length - 1);
};


console.log(sortedArrayToBST([-10, -3, 0, 5, 9]));