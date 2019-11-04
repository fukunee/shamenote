var maxProduct = function (nums) {
    let arrs = [], curr = [], cand = [];
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 0) {
            cand.push(0);
            arrs.push(curr);
            curr = [];
        } else {
            curr.push(nums[i]);
        }
    }
    arrs.push(curr);
    arrs.forEach(arr => {
        let ilm, irm, irp;
        for (let i = 0; i < arr.length; i++) {
            arr[i] *= (arr[i - 1] ? arr[i - 1] : 1);
            if (ilm === undefined && arr[i] < 0) ilm = i;
            if (arr[i] < 0) irm = i;
            if (arr[i] > 0) irp = i;
        }
        if (ilm !== undefined && irm !== undefined && ilm !== irm) cand.push(arr[irm] / arr[ilm]);
        if (ilm !== undefined && irm !== undefined && ilm === irm) cand.push(arr[irm]);
        if (irp !== undefined) cand.push(arr[irp]);
    })
    return Math.max(...cand);
};
console.log(maxProduct([1, 0, -1, 2, 3, -5, -2]));