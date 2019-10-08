/*
// 解法1.素数法。由于整数有精度问题，该方法不能证明正确性
var groupAnagrams = function (strs) {
    const t = {};
    "abcdefghijklmnopqrstuvwxyz".split('').forEach(function (v, i) {
        t[v] = i;
    });
    let res = {};
    for (let i = 0; i < strs.length; i++) {
        const str = strs[i];
        const hash = str.split('').reduce((sum, s) => {
            return sum * [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101][t[s]];
        }, 1);
        res[hash] ? res[hash].push(str) : res[hash] = [str]
    }

    return Object.values(res);
};*/

// 解法2.排序法。优化：使用一些特征先筛选出数组中孤立的字符串
const groupAnagrams = function (strs) {
    const t = {};
    "abcdefghijklmnopqrstuvwxyz".split('').forEach(function (v, i) {
        t[v] = i;
    });
    const calValue = function (str) {
        let v = 0;
        for (let i = 0; i < str.length; i++) {
            v += Math.pow(2, t[str[i]]);
        }
        return v * str.length;
    };
    let map = {};
    for (let i = 0; i < strs.length; i++) {
        let s = calValue(strs[i]);//特征为字符串出现过的字符，若俩字符串出现过的字符不相同那么他们不是异位字符串
        if (map[s] !== undefined) {
            map[s].push(strs[i]);
        } else {
            map[s] = [strs[i]];
        }
    }
    let step1 = Object.values(map);

    let step2 = [];
    let op = [];
    step1.forEach(function (v) {
        if (v.length === 1) {
            op.push(v);
        } else {
            step2 = step2.concat(v);
        }
    });
    let map2 = {};
    for (let i = 0; i < step2.length; i++) {
        let s = step2[i].split('').sort().join('');//排序后相等的字符串为异位字符串
        if (map2[s]) {
            map2[s].push(step2[i]);
        } else {
            map2[s] = [step2[i]];
        }
    }
    return op.concat(Object.values(map2));
};