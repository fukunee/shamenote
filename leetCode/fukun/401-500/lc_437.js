var pathSum = function (root, sum) {
    const node = {};

    function findNode(root, val, sum, node) {
        if (root === null) return 0;
        let count = 0;
        val += root.val;
        if (val === sum) count++;
        if (node[val - sum] !== undefined) count += node[val - sum]
        node[val] = node[val] ? ++node[val] : 1;
        return count + findNode(root.left, val, sum, node) + findNode(root.right, val, sum, node) + (node[val]-- ? 0 : 0);
    }

    return findNode(root, 0, sum, node);
};


function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}


// var pathSum = function (root, sum) {
//     let sumTree = root ? new TreeNode(root.val) : null;
//     const helper1 = function (node1, node2) {
//         if (!node1) return;
//         if (node1.left) {
//             node2.left = new TreeNode(node2.val + node1.left.val);
//             helper1(node1.left, node2.left);
//         }
//         if (node1.right) {
//             node2.right = new TreeNode(node2.val + node1.right.val);
//             helper1(node1.right, node2.right);
//         }
//     }
//     helper1(root, sumTree);
//
//     let count = 0;
//     const helper2 = function (node, sum, mod) {
//         if (!node) return;
//         count += helper3(node, sum, mod);
//         helper2(node.left, sum, node.val);
//         helper2(node.right, sum, node.val);
//     }
//     const helper3 = function (node, sum, mod) {
//         if (!node) return 0;
//         return helper3(node.left, sum, mod) + helper3(node.right, sum, mod) + (node.val - mod === sum ? 1 : 0);
//     }
//
//     helper2(sumTree, sum, 0);
//     return count;
// };
let a1 = new TreeNode(1);
let a2 = new TreeNode(2);
let a3 = new TreeNode(3);
let a4 = new TreeNode(4);
let a5 = new TreeNode(5);
let a6 = new TreeNode(6);
let a7 = new TreeNode(7);
let a8 = new TreeNode(8);
a1.left = a2;
a1.right = a3;
a2.left = a4;
a2.right = a5;
a4.left = a6;
a3.right = a7;
a3.left = a8;
console.log(pathSum(a1, 7));
