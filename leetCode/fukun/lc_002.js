function ListNode(val) {
    this.val = val;
    this.next = null;
}

//！！该方法会破坏入参链表
function singleLinkedAdd(nodeA, nodeB) {
    //参数检测
    const _isSingleListNode = (node) => {
        return ("val" in node) && (!isNaN(node.val)) && ("next" in node);
    };
    if (!_isSingleListNode(nodeA) || !_isSingleListNode((nodeB))) {
        return "Arguments error: Wrong type."
    }

    //主程序开始
    let dummyHead = new ListNode(0);
    let curr=dummyHead;
    let _ts = 0;

    do {
        //迭代
        curr.next = new ListNode((nodeA.val + nodeB.val + _ts) % 10);
        curr=curr.next;
        _ts = (nodeA.val + nodeB.val) + _ts >= 10 ? 1 : 0;
        nodeA.val=0;
        nodeB.val=0;
        nodeA = nodeA.next?nodeA.next:nodeA;
        nodeB = nodeB.next?nodeB.next:nodeB;
        //结束判断
    } while (_ts !== 0 || nodeA.val !== 0 || nodeB.val !== 0 || nodeA.next || nodeB.next);

    //返回
    return dummyHead.next;
}
