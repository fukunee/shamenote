var isPalindrome = function (head) {
    if (!head) return false;
    let currl = head,
        currh = head,
        list1 = head,
        list2 = null,
        process = 0;
    while (1) {
        if (!currh.next) {
            [list2, currl.next] = [currl.next, null];
            if (process % 2 === 0) list1 = list1.next;
            break;
        }
        currh = currh.next;
        process++;
        if (process % 2 === 0) [currl.next.next, list1, currl.next] = [list1, currl.next, currl.next.next];
    }
    while (1) {
        if (list1 === null && list2 === null) break;
        if (list1 === null ^ list2 === null || list1.val !== list2.val) return false;
        [list1, list2] = [list1.next, list2.next];
    }
    return true;
};

function ListNode(val) {
    this.val = val;
    this.next = null;
}

let a1 = new ListNode(1);
let a2 = new ListNode(2);
let a3 = new ListNode(3);
let a4 = new ListNode(4);
let a5 = new ListNode(2);
let a6 = new ListNode(2);
let a7 = new ListNode(1);
a1.next = a2;
a2.next = a3;
a3.next = a4;
a4.next = a5;
a5.next = a6;
a6.next = a7;
console.log(isPalindrome(a1));
