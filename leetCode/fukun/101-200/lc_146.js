function DoubleNode(key, val) {
    this.key = key;
    this.val = val;
    this.next = null;
    this.pre = null;
}

/**
 * @param {number} capacity
 */
var LRUCache = function (capacity) {
    //创建双向链表
    this.head = new DoubleNode(null);
    this.tail = new DoubleNode(null);
    this.head.next = this.tail;
    this.tail.pre = this.head;
    //创建哈西表
    this.hash = {};
    //其他
    this.capacity = capacity;
    this.length = 0;
};


/**
 * @param {number} key
 * @return {number}
 */
LRUCache.prototype.get = function (key) {
    if (!this.hash[key]) return -1
    //删除已查节点
    this.hash[key].pre.next = this.hash[key].next;
    this.hash[key].next.pre = this.hash[key].pre;
    //表尾插入删除节点
    this.hash[key].pre = this.tail.pre;
    this.hash[key].next = this.tail;
    this.tail.pre.next = this.hash[key];
    this.tail.pre = this.hash[key];
    return this.hash[key].val;
};

/**
 * @param {number} key
 * @param {number} value
 * @return {void}
 */
LRUCache.prototype.put = function (key, value) {
    //若更新缓存，重复查询操作
    if (this.hash[key]) {
        this.get(key);
        this.hash[key].val = value;
    } else {
        //尾部创建新节点
        this.hash[key] = new DoubleNode(key, value);
        this.tail.pre.next = this.hash[key];
        this.hash[key].pre = this.tail.pre;
        this.hash[key].next = this.tail;
        this.tail.pre = this.hash[key];
        this.length++;
        //头部删除节点
        if (this.length > this.capacity) {
            this.hash[this.head.next.key] = null;
            this.head.next = this.head.next.next;
            this.head.next.pre = this.head;
        }
    }
};

var obj = new LRUCache(2)
obj.put(2, 1)
obj.put(1, 1);
obj.put(2, 3);
obj.put(4, 1);
console.log(obj.get(1));
console.log(obj.get(2));
