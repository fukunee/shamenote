function ListNode(val) {
    this.val = val;
    this.next = null;
}

var reverseBetween = function (head, m, n) {
    if (m === n) return head;
    let i = 1,
        tmp = null,
        left = null,
        start = null,
        output = head;
    while (head) {
        let next = head.next;
        if (i === m) {
            left = tmp;
            start = head;
        } else if (i === n) {
            start.next = head.next;
            m === 1 ? (output = head) : (left.next = head);
            head.next = tmp;
        } else if (i < n && i > m) {
            head.next = tmp;
        }
        tmp = head;
        head = next;
        i++;
    }
    return output;
};

let ln0 = new ListNode(1);
let ln1 = new ListNode(2);
let ln2 = new ListNode(3);
ln0.next = ln1;
ln1.next = ln2;
console.log(reverseBetween(ln0, 2, 2));