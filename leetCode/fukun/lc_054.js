const spiralOrder = function (onion) {
    let row = onion.length;
    if (row === 0) return [];
    let col = onion[0].length;
    if (col === 0) return [];

    let wrap = [];
    if (row === 1) {
        return onion[0];
    } else {
        if (col === 1) {
            return onion.map((v) => { return v[0] });
        } else {
            wrap = wrap.concat(onion.shift());
            let left = [];
            onion.forEach((v) => {
                wrap.push(v.pop());
                left.push(v.shift());
            });
            wrap = wrap.concat(onion.pop().reverse());
            wrap = wrap.concat(left.reverse());
        }
    }
    return wrap.concat(spiralOrder(onion));
};
console.log(spiralOrder([[1, 2, 3], [4, 5, 6], [7, 8, 9]]));