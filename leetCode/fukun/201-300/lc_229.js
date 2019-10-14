var majorityElement = function (nums) {
    let cand1, cand2, count1 = 0, count2 = 0;
    for (let i = 0; i < nums.length; i++) {
        if (count1 <= 0 && cand2 !== nums[i]) cand1 = nums[i];
        if (count2 <= 0 && cand1 !== nums[i]) cand2 = nums[i];
        cand1 === nums[i] ? count1++ : count1 -= 0.5;
        cand2 === nums[i] ? count2++ : count2 -= 0.5;
    }
    count1 = 0;
    count2 = 0;
    for (let i = 0; i < nums.length; i++) {
        if (cand1 === nums[i]) count1++;
        if (cand2 === nums[i]) count2++;
    }
    let output = [];
    if (count1 > Math.floor(nums.length / 3)) output.push(cand1);
    if (count2 > Math.floor(nums.length / 3)) output.push(cand2);
    return output;
};
console.log(majorityElement([1, 2, 0, 4, 5, 0, 6, 7, 8, 9, 9, 9, 9, 9, 9, 0, 0, 0, 0, 0]));
console.log(majorityElement([1, 1, 1, 3, 3, 2, 2, 2]));
