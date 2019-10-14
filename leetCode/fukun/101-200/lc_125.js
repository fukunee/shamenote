const isPalindrome = function (s) {
    let curr1 = 0;
    let curr2 = s.length - 1;
    const p = /[a-zA-Z0-9]/i;
    while (curr2 >= curr1) {
        if (!p.test(s[curr1])) {
            curr1++;
            continue;
        }
        if (!p.test(s[curr2])) {
            curr2--;
            continue;
        }
        if (s[curr1].toLowerCase() !== s[curr2].toLowerCase()) {
            return false;
        }
        curr1++;
        curr2--;
    }
    return true;
};
console.log(isPalindrome("A man, a plan, a canal: Panama"));
console.log(isPalindrome("0P"))