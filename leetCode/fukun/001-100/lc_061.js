function ListNode(val) {
    this.val = val;
    this.next = null;
}
const rotateRight = (head, k) => {
    if (!head) return head;
    let curr = head,
        tmp = null,
        n = 0;

    // 计算长度并接续尾部
    while (1) {
        n++;
        if (!curr.next) {
            curr.next = head;
            break;
        }
        curr = curr.next;
    }

    //找到头部断开头部
    k = k % n;
    while (k++ < n) {
        if(k === n) tmp = head;
        head = head.next;
    }
    tmp.next = null;
    return head;
};

let ln0 = new ListNode(0);
let ln1 = new ListNode(1);
let ln2 = new ListNode(2);
ln0.next = ln1;
ln1.next = ln2;
console.log(rotateRight(ln0, 4));