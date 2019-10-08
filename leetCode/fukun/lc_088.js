const merge = function (nums1, m, nums2, n) {
    while (m >= 0 && n > 0) nums1[m + n - 1] = nums1[m - 1] >= nums2[n - 1] ? nums1[m-- - 1] : nums2[n-- - 1];
};
console.log(merge([1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3));