 //有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。 
//
// 如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。 
//
// 给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。 
//
// 对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。 
//
// 
//
// 示例 1： 
//
// 输入："(()())(())"
//输出："()()()"
//解释：
//输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
//删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。 
//
// 示例 2： 
//
// 输入："(()())(())(()(()))"
//输出："()()()()(())"
//解释：
//输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
//删除每隔部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
// 
//
// 示例 3： 
//
// 输入："()()"
//输出：""
//解释：
//输入字符串为 "()()"，原语化分解得到 "()" + "()"，
//删除每个部分中的最外层括号后得到 "" + "" = ""。
// 
//
// 
//
// 提示： 
//
// 
// S.length <= 10000 
// S[i] 为 "(" 或 ")" 
// S 是一个有效括号字符串 
// 
// Related Topics 栈
  
  package cn;
  public class RemoveOutermostParentheses{
      public static void main(String[] args) {
      
           Solution solution = new RemoveOutermostParentheses().new Solution();
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public String removeOuterParentheses(String S) {
        //正好利用这个机会比较直接charAt和转换成char[]有没有区别，也有可能因为数据量小测不出来
        //99%char[],
        //使用.charAt没有那么快
        char[] strchar = S.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0, begin = 0, end = 0, count = 0, n = S.length();
        for(; i < n; i++){
           if(strchar[i] == '('){
            //if(S.charAt(i) == '('){
                if(count == 0)
                    begin = i;
                count++;

            }
            else if(strchar[i] == ')') {
            //else if(S.charAt(i) == ')'){
                count--;
                if(count == 0){
                    sb.append(S.substring(begin+1, i));
                }

            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }