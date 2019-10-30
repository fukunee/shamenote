function ListNode(val) {
    this.val = val;
    this.next = null;
}


var mergeKLists = function (lists) {
    const merge = function (ln1, ln2) {
        let output = new ListNode(null);
        let curr = output;
        while (1) {
            if (!ln1 && !ln2) break;
            !ln2 || (ln1 && ln1.val <= ln2.val) ? [curr.next, curr, ln1] = [ln1, ln1, ln1.next] : [curr.next, curr, ln2] = [ln2, ln2, ln2.next];
        }
        return output.next;
    }
    if (lists.length === 0) return null;
    if (lists.length === 1) return lists[0];
    for (let i = 0; i < lists.length; i++) {
        if (i === lists.length) return lists;
        lists.splice(i, 2, merge(lists[i], lists[i + 1]));
    }
    return mergeKLists(lists);
};

let a1 = new ListNode(1);
let a2 = new ListNode(4);
let a3 = new ListNode(5);
a1.next = a2;
a2.next = a3;
let b1 = new ListNode(1);
let b2 = new ListNode(3);
let b3 = new ListNode(4);
b1.next = b2;
b2.next = b3;
let c1 = new ListNode(2);
let c2 = new ListNode(6);
c1.next = c2;
console.log(mergeKLists([null, a1, b1, c1]));