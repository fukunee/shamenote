const nextPermutation = function(nums) {
    let maxIndex = -Infinity,
        changeIndex;
    //找到交换点
    for (let i = nums.length - 1; i >= 0; i--) {
        for (let j = i - 1; j >= 0; j--) {
            if (nums[i] > nums[j]) {
                if (maxIndex < j) {
                    maxIndex = j;
                    changeIndex = i;
                }
            }
        }
    }
    //交换后就再逆序
    if (changeIndex) {
        [nums[maxIndex], nums[changeIndex]] = [nums[changeIndex], nums[maxIndex]];//交换写法，可以参考。
        for (let i = maxIndex + 1; i < nums.length; i++) {
            let min = i;
            for (let j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            [nums[i], nums[min]] = [nums[min], nums[i]];
        }
    } else {
        nums.reverse();
    }
};