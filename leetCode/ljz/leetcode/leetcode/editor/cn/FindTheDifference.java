//给定两个字符串 s 和 t，它们只包含小写字母。
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。 
//
// 请找出在 t 中被添加的字母。 
//
// 
//
// 示例: 
//
// 输入：
//s = "abcd"
//t = "abcde"
//
//输出：
//e
//
//解释：
//'e' 是那个被添加的字母。
// 
// Related Topics 位运算 哈希表

package cn;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
    public static void main(String[] args) {

        Solution solution = new FindTheDifference().new Solution();
        char a = solution.findTheDifference("abcdo", "kabdco");
        System.out.print(a);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public char findTheDifference(String s, String t) {
            /**
             * 第一次提交90，第二次60,去掉count 90
             */
            int i = 0;
            int[] a = new int[26];
            for (; i < s.length(); i++) {
                a[s.charAt(i) - 'a']++;
                a[t.charAt(i) - 'a']--;
            }
            a[t.charAt(i) - 'a']--;
            for (i = 0; i < 26; i++)
                if (a[i] == -1) return (char) ('a' + i);
            return 'a';

            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}