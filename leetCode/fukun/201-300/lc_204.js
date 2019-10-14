/**
 * @param {number} n
 * @return {number}
 */
var countPrimes = function (n) {
    if (n <= 2) return 0;
    let primes = [2];
    for (let i = 3; i < n; i++) {
        let j = 0;
        while (1) {
            if (primes[j] > Math.sqrt(i)) {
                primes.push(i);
                break;
            }
            if (i % primes[j] === 0) break;
            j++;
        }
    }
    return primes.length;
};
console.log(countPrimes(10));//4