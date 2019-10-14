var isUgly = function (num) {
    while (1) {
        let num2=num;
        num = num % 2 === 0 ? num / 2 : num;
        num = num % 3 === 0 ? num / 3 : num;
        num = num % 5 === 0 ? num / 5 : num;
        if(num===1)return true;
        if (num===num2)return false;
    }
};
console.log(isUgly(10));