const lengthOfLastWord = function (s) {
    let output=0;
    for (let i = s.length - 1; i >= 0; i--) {
        if(s[i]===' '){
            if(output!==0) return output;
        }else{
            output++;
        }
    }
    return output;
};
console.log(lengthOfLastWord("a "));
