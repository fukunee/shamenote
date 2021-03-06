function TreeNode(val, up) {
    this.val = val;
    this.up = up;
    this.left = null;
    this.right = null;
}

function MinStackTree(root) {
    this.root = root;
    this.queue = [root];
    this.length = 1;
}

MinStackTree.prototype.add = function (val) {
    this.length++;
    let insertCurr = this.queue[0];
    let newCurr = null;
    if (insertCurr.left) {
        insertCurr.right = new TreeNode(val, insertCurr);
        newCurr = insertCurr.right;
        this.queue.push(insertCurr.right);
        this.queue.shift();
    } else {
        insertCurr.left = new TreeNode(val, insertCurr);
        newCurr = insertCurr.left;
        this.queue.push(insertCurr.left);
    }
    while (1) {
        if (newCurr.up) {
            if (newCurr.up.val > newCurr.val) [newCurr.up.val, newCurr.val] = [newCurr.val, newCurr.up.val];
            newCurr = newCurr.up;
        } else {
            break;
        }
    }
};

MinStackTree.prototype.remove = function () {
    this.length--;
    let removeCurr = this.queue.pop(),
        curr = this.root;
    this.root.val = removeCurr.val;
    if (removeCurr.up.left === removeCurr) {
        removeCurr.up.left = null
    } else {
        removeCurr.up.right = null;
        this.queue.unshift(removeCurr.up);
    }
    while (1) {
        if (!curr.left || curr.val <= Math.min(curr.left.val, curr.right ? curr.right.val : Infinity)) break;
        if (!curr.right || curr.left.val <= curr.right.val) {
            [curr.left.val, curr.val] = [curr.val, curr.left.val];
            curr = curr.left;
        } else {
            [curr.right.val, curr.val] = [curr.val, curr.right.val];
            curr = curr.right;
        }
    }
};

let findKthLargest = function (nums, k) {
    let root = new TreeNode(nums[0], null);
    let stackTree = new MinStackTree(root);
    for (let i = 1; i < nums.length; i++) {
        stackTree.add(nums[i]);
        if (stackTree.length > k) stackTree.remove();
    }
    return stackTree.root.val;
};

console.log(findKthLargest([3, 2, 1, 5, 6, 4], 2));
