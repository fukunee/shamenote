var mergeTrees = function(t1, t2) {
    if(!t1&&!t2)return null;
    const helper=function(node1,node2,newNode){
        if(!node1&&!node2)return;
        if(!node1)newNode.val=node2.val;
        if(!node2)newNode.val=node1.val;
        if(node1&&node2)newNode.val=node1.val+node2.val;
        if((node1&&node1.left)||(node2&&node2.left)){
            newNode.left=new TreeNode(null);
            helper(node1?node1.left:null,node2?node2.left:null,newNode.left);
        }
        if((node1&&node1.right)||(node2&&node2.right)){
            newNode.right=new TreeNode(null);
            helper(node1?node1.right:null,node2?node2.right:null,newNode.right)
        }
    };
    let output=new TreeNode(null);
    helper(t1,t2,output);
    return output;
};