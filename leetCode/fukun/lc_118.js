const generate = function (rows) {
    return rows === 0 ? [] : (() => {
        const op = generate(rows - 1);
        op.push([1]);
        for (let i = 0; i < rows - 1; i++) op[rows - 1].push(op[rows - 2][i] + (i === rows - 2 ? 0 : op[rows - 2][i + 1]));
        return op;
    })();
};

console.log(generate(10));
