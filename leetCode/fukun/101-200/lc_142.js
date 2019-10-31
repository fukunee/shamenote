var detectCycle = function (head) {
    let currs = head, currf = head, meet = null;
    while (1) {
        if (!currf || !currf.next) return null;
        currf = meet ? currf : currf.next;
        [currs, currf] = [currs.next, currf.next];
        if (currs === currf) {
            if (currs === head) return head;
            if (!meet) {
                [meet, currs] = [currs, head];
            } else {
                return currs;
            }
        }
    }
};