function ListNode(val) {
    this.val = val;
    this.next = null;
}

const reverseList = function (head) {
    let tmp = null;
    while (head) {
        let next = head.next;
        head.next = tmp;
        tmp = head;
        head = next;
    }
    return tmp;
};

let ln0 = new ListNode(0);
let ln1 = new ListNode(1);
let ln2 = new ListNode(1);
ln0.next = ln1;
ln1.next = ln2;
console.log(reverseList(ln0));