function ListNode(val) {
    this.val = val;
    this.next = null;
}

var getIntersectionNode = function (headA, headB) {
    let curr = headA;
    while (curr) {
        curr.flag = true;
        curr = curr.next;
    }
    curr = headB;
    while (curr) {
        if (curr.flag === true) return curr;
        curr = curr.next;
    }
    return null;
};

let a = new ListNode(1);
let a2 = new ListNode(2);
let a3 = new ListNode(3);
let a4 = new ListNode(4);
let b = new ListNode(9);
let b2 = new ListNode(8);

a.next = a2;
a2.next = a3;
a3.next = a4;
b.next = b2;
b2.next = a3;
console.log(getIntersectionNode(a, b));

