/**
 * initialize your data structure here.
 */
var MinStack = function () {
    this.values = [];
    this.minValue = [];
};

/**
 * @param {number} x
 * @return {void}
 */
MinStack.prototype.push = function (x) {
    this.minValue.push(this.minValue[0] ? Math.min(this.top(), x) : x);
    return this.values.push(x);
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function () {
    this.minValue.pop();
    return this.values.pop();
};

/**
 * @return {number}
 */
MinStack.prototype.top = function () {
    return this.values[this.values.length - 1];
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function () {
    return this.minValue[this.minValue.length - 1];
};

var obj = new MinStack();
console.log(obj.push(1));
console.log(obj.top());
console.log(obj.getMin());
console.log(obj.pop());
