package easy;
/*lc_258*/
public class AddDigits {
    public static void main(String[] args){
        Solution solution = new AddDigits().new Solution();
        int num = 38;
        System.out.print(solution.addDigits(num));
    }
    class Solution {
        public int addDigits(int num) {
            if(num < 10){
                return num;
            }
            int sum = 0;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            return addDigits(sum);
        }
    }
}
