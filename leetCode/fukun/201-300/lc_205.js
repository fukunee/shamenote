const isIsomorphic = (s, t) => {
    for (let i = 0; i < s.length - 1; i++) {
        if (s.indexOf(s[i], i + 1) !== t.indexOf(t[i], i + 1)) return false
    }
    return true
}
console.log(isIsomorphic("egg", "add"));
