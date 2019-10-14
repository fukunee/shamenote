const twoSum = function (numbers, target) {
    let curr1 = 0;
    let curr2 = numbers.length - 1;
    while (curr1 < curr2) {
        if (numbers[curr1] + numbers[curr2] > target) {
            curr2--;
            continue;
        }
        if (numbers[curr1] + numbers[curr2] < target) {
            curr1++;
            continue;
        }
        return [curr1 + 1, curr2 + 1];
    }
};
console.log(twoSum([2, 7, 11, 15], 9));