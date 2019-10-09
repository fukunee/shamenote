 //给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。 
//
// 重复出现的子串要计算它们出现的次数。 
//
// 示例 1 : 
//
// 
//输入: "00110011"
//输出: 6
//解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
//
//请注意，一些重复出现的子串要计算它们出现的次数。
//
//另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。
// 
//
// 示例 2 : 
//
// 
//输入: "10101"
//输出: 4
//解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。
// 
//
// 注意： 
//
// 
// s.length 在1到50,000之间。 
// s 只包含“0”或“1”字符。 
// 
// Related Topics 字符串
  
  package cn;
  public class CountBinarySubstrings{
      public static void main(String[] args) {
      
           Solution solution = new CountBinarySubstrings().new Solution();
          /**
           * 00110011 6
           * 10101 4
           * 00110 3
           * 00100 2
           */
          String a = "00110011";
           System.out.println(solution.countBinarySubstrings(a));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countBinarySubstrings(String s) {
        /**
         * 垃圾方法 5%


        if(s == null) return 0;
        int size = s.length();
        if(size == 1) return 0;
        int count = 0, i = 0, j = 0, m = 0;
        char pre = s.charAt(m);
        while(m < size){
            while(i < size && s.charAt(i) == pre){
                j++;
                i++;
            }
            while(i < size && s.charAt(i) != pre){
                j--;
                if(j == 0) break;
                i++;
            }
            if(j == 0) count++;
            m++;
            if(m >= size) break;
            i = m;
            j = 0;
            pre = s.charAt(m);
        }
        return count;
         **/

        /**
         * 对上面的方法改进 时间是之前的1/3，但是还是垃圾 5%
         */
        /*
        if(s == null) return 0;
        int size = s.length();
        if(size == 1) return 0;
        int count = 0, i = 0, j = 0, m = 0, n = 0;
        char pre = s.charAt(m);
        while(m < size){
            while(i < size && s.charAt(i) == pre){
                j++;
                i++;
            }
            while(i < size && s.charAt(i) != pre){
                j--;
                n++;
                if(j == 0) break;
                i++;
            }
            if(j == 0) {
                count += n;
                m += n;
            }
            else m++;
            if(m >= size) break;
            i = m;
            j = 0;
            pre = s.charAt(m);
            n = 0;
        }
        return count;

         */

        /**
         * 再进行优化 12ms 96%
         */
        if(s == null) return 0;
        int size = s.length();
        if(size == 1) return 0;
        int count = 0, i = 0, j = 0, m = 0, n = 0;
        int[] a = new int[size];
        a[0] = 1;
        for(i = 1; i < size; i++){
            if(s.charAt(i) == s.charAt(i-1)) a[j]++;
            else{
                a[++j] = 1;
            }
        }
        for(i = 1; i < a.length; i++){
            count += Math.min(a[i], a[i-1]);
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }