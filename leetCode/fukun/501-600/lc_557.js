var reverseWords = function(s) {
    return s.split(' ').map(v=>v.split('').reverse().join('')).join(' ');
};
console.log(reverseWords("Let's take LeetCode contest"));