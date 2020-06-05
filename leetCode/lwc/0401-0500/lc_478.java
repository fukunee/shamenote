package leetcode;/**
 * @author lwc
 * @date 2020/6/4 15:58
 */

import java.util.Random;

/**
 * @ClassName: leetcode.lc_478
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: lwc
 * @date: 2020/6/4 15:58
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/6/4      lwc          v1.0.0               修改原因
 */
public class lc_478 {
    class Solution {
        double rad, xc, yc;
        public Solution(double radius, double x_center, double y_center) {
            rad = radius;
            xc = x_center;
            yc = y_center;
        }

        public double[] randPoint() {
            double d = rad * Math.sqrt(Math.random());
            double theta = Math.random() * 2 * Math.PI;
            return new double[]{d * Math.cos(theta) + xc, d * Math.sin(theta) + yc};
        }
    }
}
