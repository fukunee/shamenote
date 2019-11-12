function MultiTreeNode(val) {
    this.val = val;
    this.next = [];
}

var Trie = function () {
    this.root = new MultiTreeNode(null);
};

Trie.prototype.insert = function (word) {
    word += '0';
    let curr = 0,
        currT = this.root;
    sync: while (1) {
        for (let i = 0; i < currT.next.length; i++) {
            if (currT.next[i].val === word[curr]) {
                currT = currT.next[i];
                curr++;
                continue sync;
            }
        }
        for (let i = curr; i < word.length; i++) {
            let node = new MultiTreeNode(word[i]);
            currT.next.push(node);
            currT = node;
        }
        break sync;
    }
};

Trie.prototype.search = function (word) {
    word += '0';
    let curr = 0,
        currT = this.root;
    sync:while (1) {
        if (currT.next.length === 0 && curr === word.length) return true;
        for (let i = 0; i < currT.next.length; i++) {
            if (currT.next[i].val === word[curr]) {
                currT = currT.next[i];
                curr++;
                continue sync;
            }
        }
        return false;
    }
};

Trie.prototype.startsWith = function (prefix) {
    let curr = 0,
        currT = this.root;
    sync:while (1) {
        if (curr === prefix.length) return true;
        for (let i = 0; i < currT.next.length; i++) {
            if (currT.next[i].val === prefix[curr]) {
                currT = currT.next[i];
                curr++;
                continue sync;
            }
        }
        return false;
    }
};

var obj = new Trie();
obj.insert('leet');
obj.insert('code');
console.log(obj.search('le'))
console.log(obj.startsWith('le'))
console.log(obj.search('coet'))
