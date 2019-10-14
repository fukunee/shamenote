function ListNode(val) {
    this.val = val;
    this.next = null;
}

const hasCycle = function (head) {
    let curr = head;
    while (curr) {
        if (curr.flag) return true;
        curr.flag = true;
        curr = curr.next;
    }
    return false;
};

let ln0 = new ListNode(1);
let ln1 = new ListNode(2);
let ln2 = new ListNode(3);
ln0.next = ln1;
ln1.next = ln2;
console.log(hasCycle(ln0, 2, 2));