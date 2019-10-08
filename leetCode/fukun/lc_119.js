const getRow = function (rows) {
    return rows === 0 ? [1] : (() => {
        const lastRow = getRow(rows - 1);
        let op = [1];
        for (let i = 0; i < rows; i++) op.push(lastRow[i] + (i === rows - 1 ? 0 : lastRow[i + 1]));
        return op;
    })();
};

console.log(getRow(3));