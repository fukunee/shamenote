//给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
//
// 输入为三个整数：day、month 和 year，分别表示日、月、年。 
//
// 您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。 
//
// 
//
// 示例 1： 
//
// 输入：day = 31, month = 8, year = 2019
//输出："Saturday"
// 
//
// 示例 2： 
//
// 输入：day = 18, month = 7, year = 1999
//输出："Sunday"
// 
//
// 示例 3： 
//
// 输入：day = 15, month = 8, year = 1993
//输出："Sunday"
// 
//
// 
//
// 提示： 
//
// 
// 给出的日期一定是在 1971 到 2100 年之间的有效日期。 
// 
// Related Topics 数组

package cn;

import java.time.LocalDate;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Solution solution = new DayOfTheWeek().new Solution();
        System.out.print(solution.dayOfTheWeek(28, 10, 2019));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        //w=y+[y/4]+[c/4]-2c+[26(m+1）/10]+d-1
        public String dayOfTheWeek(int day, int month, int year) {
            String[] a = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            if (month == 1 || month == 2) {
                month += 12;
                year--;
            }
            int i = ((day + 2 * month + 3 * (month + 1)/5 + year + year / 4 - year / 100 + year / 400) %7);
            //int i = year + (year / 4) + (c / 4) - 2 * c + (13 * (month + 1) / 5) + day - 1;
            return a[i];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}