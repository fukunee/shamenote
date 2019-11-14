package easy;
/*lc_504*/
public class Base7 {
    public static void main(String[] args){
        Solution solution = new Base7().new Solution();
        int num =-7;
        System.out.print(solution.convertToBase7(num));
    }
    class Solution {
        public String convertToBase7(int num) {
            if(num == 0){
                return "0";
            }
            boolean ispostn = num >= 0;
            StringBuilder res = new StringBuilder();
            num = Math.abs(num);
            while(num > 0){
                res.append(num % 7);
                num /= 7;
            }
            if(!ispostn){
                res.append("-");
            }
            return res.reverse().toString();
        }
    }
}
