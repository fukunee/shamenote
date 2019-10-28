/**
 * @param {number[]} A
 * @return {number[]}
 */
var sortedSquares = function (A) {
    let arr1 = [], arr2 = [], arr3 = [];
    for (let i = 0; i < A.length; i++) {
        if (A[i] < 0) {
            arr1.unshift(A[i] * A[i]);
        } else {
            arr2.push(A[i] * A[i]);
        }
    }
    let curr1 = 0, curr2 = 0;
    while (curr1 < arr1.length || curr2 < arr2.length) {
        if (curr2>=arr2.length || arr1[curr1] < arr2[curr2]) {
            arr3.push(arr1[curr1]);
            curr1++;
        } else {
            arr3.push(arr2[curr2]);
            curr2++;
        }
    }
    return arr3;
};
console.log(sortedSquares([-4, -1, 0, 3, 10]));