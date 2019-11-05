 //给定一副牌，每张牌上都写着一个整数。 
//
// 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组： 
//
// 
// 每组都有 X 张牌。 
// 组内所有的牌上都写着相同的整数。 
// 
//
// 仅当你可选的 X >= 2 时返回 true。 
//
// 
//
// 示例 1： 
//
// 输入：[1,2,3,4,4,3,2,1]
//输出：true
//解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
// 
//
// 示例 2： 
//
// 输入：[1,1,1,2,2,2,3,3]
//输出：false
//解释：没有满足要求的分组。
// 
//
// 示例 3： 
//
// 输入：[1]
//输出：false
//解释：没有满足要求的分组。
// 
//
// 示例 4： 
//
// 输入：[1,1]
//输出：true
//解释：可行的分组是 [1,1]
// 
//
// 示例 5： 
//
// 输入：[1,1,2,2,2,2]
//输出：true
//解释：可行的分组是 [1,1]，[2,2]，[2,2]
// 
//
// 
//提示： 
//
// 
// 1 <= deck.length <= 10000 
// 0 <= deck[i] < 10000 
// 
//
// 
// Related Topics 数组 数学
  
  package cn;

 import java.util.HashSet;
 import java.util.Iterator;
 import java.util.Set;

 public class XOfAKindInADeckOfCards{
      public static void main(String[] args) {
      
           Solution solution = new XOfAKindInADeckOfCards().new Solution();
           int[] a = {1,2,3,4,4,3,2,1};
           solution.hasGroupsSizeX(a);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        /**
         * 67%,看看题解怎么做的
         * 官方题解和我的想法一摸一样，但是他没有用set保存，直接用数组读的
         * 修改一下，尝试不用set
         */
        /*
        int[] a = new int[10001];
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0, count = 0;
        for(; i < deck.length; i++){
            a[deck[i]]++;
            set.add(deck[i]);
        }
        j = a[deck[0]];
        for(Integer k : set){
            j = gcd(j, a[k]);
        }
        return (j >= 2);

         */

        /**
         * 100%
         */
        int[] a = new int[10001];
        int i = 0, j = -1, count = 0;
        for(; i < deck.length; i++){
            a[deck[i]]++;
        }
        for(int k : a){
            if(k > 0){
                if(j == -1)
                    j = k;
                else
                    j = gcd(j, k);
            }
        }
        return (j >= 2);
    }
    private int gcd(int a, int b) {
        int rem = 0;
        while (b != 0) {
            rem= a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }