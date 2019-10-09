 //写一个程序，输出从 1 到 n 数字的字符串表示。 
//
// 1. 如果 n 是3的倍数，输出“Fizz”； 
//
// 2. 如果 n 是5的倍数，输出“Buzz”； 
//
// 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。 
//
// 示例： 
//
// n = 15,
//
//返回:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
// 
//
  
  package cn;

 import java.util.ArrayList;
 import java.util.List;

 public class FizzBuzz{
      public static void main(String[] args) {
      
           Solution solution = new FizzBuzz().new Solution();
           System.out.print(solution.fizzBuzz(21));
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<String>();
        String str = null;
        for(int i = 1; i <= n; i++){
            str = String.valueOf(i);
            if(i % 3 == 0){
                str = "Fizz";
            }
            if(i % 5 == 0 && str.equals("Fizz"))
                str = str + "Buzz";
            else if(i % 5 == 0 && !str.equals("Fizz"))
                str = "Buzz";
            ret.add(str);
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }