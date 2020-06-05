package leetcode;/**
 * @author lwc
 * @date 2020/6/5 10:49
 */
/**
 * @ClassName: leetcode.lc_479
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/6/5 10:49
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/6/5      lwc          v1.0.0               修改原因
 */
public class lc_479 {
    public int magicalString(int n) {
        if(n <= 1) return n;

        int result = 1;
        int[] v = new int[n];
        int i = 0; int j = 0;
        int target = 1;
        int count = 0;
        while(n > 1){
            target = target == 1 ? 2 : 1;
            count = v[++j] == 0 ? 2 : v[j];
            while(count > 0 && i < v.length - 1){
                n--;
                count--;
                if(target == 1)result++;
                v[++i] = target;
            }
        }

        return result;
    }
}
