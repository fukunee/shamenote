const merge = function (intervals) {
    if (intervals.length === 0) return [];
    intervals.sort((a, b) => a[0] - b[0]);
    let arr = [intervals[0]];
    for (let i = 1; i < intervals.length; i++) {
        let len = arr.length;
        if (arr[len - 1][1] < intervals[i][0]) {
            arr.push(intervals[i]);
        } else if (intervals[i][0] <= arr[len - 1][1]) {
            if (arr[len - 1][1] < intervals[i][1]) {
                arr[arr.length - 1] = [arr[len - 1][0], intervals[i][1]];
            }
        }
    }
    return arr;
};
console.log(merge([[1, 4], [0, 0]]));