package leetcode;

/**
 * @author lwc
 * @date 2019/11/18 17:27
 */
public class lc_204 {
    public int countPrimes(int n) {
        if(n <= 2) return 0;
        int count = 1;
        for(int i = 3; i < n; i = i + 2){
            if(isPrime(i))
                count++;
        }
        return count;
    }

    public static boolean isPrime(int num) {
        if (num <= 3) {
            return num > 1;
        }
        // 不在6的倍数两侧的一定不是质数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 5; i <= sqrt; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public int CountPrimes(int n) {
        int count = 0;
        boolean[] signs = new boolean[n];
        for (int i = 2; i < n; i++) {
            //因为在 C# 中，布尔类型的默认值为 假。所以在此处用了逻辑非（！）操作符。
            if (!signs[i]) {
                count++;
                if (i <= Integer.MAX_VALUE / i) {
                    for (int j = i * i; j < n; j += i) {
                        //排除不是质数的数
                        signs[j] = true;
                    }
                }
            }
        }
        return count;
    }

}
