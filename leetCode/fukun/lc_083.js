function ListNode(val) {
    this.val = val;
    this.next = null;
}

const deleteDuplicates = function (head) {
    if(!head)return head;
    let curr = head;
    let hash = {};
    hash[head.val] = true;
    while (curr && curr.next) {
        if (hash[curr.next.val]) {
            curr.next = curr.next.next;
        } else {
            hash[curr.next.val] = true;
            curr = curr.next;
        }
    }
    return head;
};

let ln0 = new ListNode(0);
let ln1 = new ListNode(1);
let ln2 = new ListNode(1);
ln0.next = ln1;
ln1.next = ln2;
console.log(deleteDuplicates(ln0));