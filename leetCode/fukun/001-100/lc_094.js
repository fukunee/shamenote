//递归
var inorderTraversal1 = function (root) {
    let output = [];
    const helper = function (node) {
        if (!node) return;
        helper(node.left);
        output.push(node.val);
        helper(node.right);
    };
    helper(root);
    return output;
};

//迭代
var inorderTraversal = function (root) {
    let output = [];
    let stack = [];
    let curr = root;
    while (1) {
        if(!curr)return output;
        if (curr.left) {
            stack.push(curr);
            curr = curr.left
        } else {
            output.push(curr.val);
            if(curr.right){
                curr=curr.right;
            }else{
                curr = stack.pop();
                if(!curr)return output;
                curr.left = null;
            }
        }
    }
};
function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}
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

console.log(inorderTraversal1(a1));
console.log(inorderTraversal(a1));
