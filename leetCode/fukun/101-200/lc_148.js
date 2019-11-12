function ListNode(val) {
    this.val = val;
    this.next = null;
}

var sortList = function (head) {
    const merge = function (ln1, ln2) {
        let head = new ListNode(null);
        let curr = head;
        while (ln1 && ln2) {
            ln1.val < ln2.val ? [curr.next, ln1] = [ln1, ln1.next] : [curr.next, ln2] = [ln2, ln2.next];
            curr = curr.next;
        }
        curr.next = ln1 === null ? ln2 : ln1;
        return head.next;
    }
    const cut = function (ln, n) {
        let head = ln;
        let curr = new ListNode(null);
        curr.next = ln;
        let count = 0;
        while (1) {
            if (count === n || curr === null) {
                let right = curr ? curr.next : null;
                curr ? curr.next = null : null;
                return [head, right];
            }
            curr = curr.next;
            count++;
        }
    }
    const concat = function (head, ln) {
        let curr = head;
        while (1) {
            if (curr.next === null) {
                curr.next = ln;
                return curr;
            }
            curr = curr.next;
        }
    }
    //以组粒度2、4、8...进行归并
    for (let i = 2; i < Infinity; i *= 2) {
        //以每次归并后已归并部分的尾部为指针
        let curr = new ListNode(null);
        curr.next = head;
        while (1) {
            // console.log(JSON.stringify(head).split('{"val":').join('').split(',"next":').join().split(",null}}}}}").join());
            //从指针处剪切1/2粒度的链
            let [left1, right1] = cut(curr.next, i / 2);
            //全部完成，返回结果
            if (right1 === null && curr.val === null) return head;
            //当前步骤完成跳出内部循环，进行更大粒度归并
            if (right1 === null) break;
            //再剪切1/2粒度链
            let [left2, right2] = cut(right1, i / 2);
            //合并两个1/2粒度的链
            let left = merge(left1, left2);
            //变更头
            if (curr.val === null) head = left;
            //前拼接
            curr.next = left;
            //后拼接
            curr = concat(left, right2);
        }
    }
};
let a1 = new ListNode(4);
let a2 = new ListNode(3);
let a3 = new ListNode(2);
let a4 = new ListNode(1);
let a5 = new ListNode(2);
a1.next = a2;
a2.next = a3;
a3.next = a4;
a4.next = a5;
JSON.stringify(sortList(a1));
