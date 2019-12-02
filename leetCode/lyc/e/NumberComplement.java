package easy;

/*lc_476
* */

public class NumberComplement {
    public static void main(String[] args){
        Solution solution = new NumberComplement().new Solution();
        int num = 5;
        System.out.print(solution.findComplement(num));
    }
    class Solution {
        public int findComplement(int num) {
            String str = Integer.toBinaryString(num);
            StringBuilder sb = new StringBuilder();
            for(char c : str.toCharArray()){
                if(c == '1'){
                    sb.append('0');
                }else{
                    sb.append('1');
                }
            }
            int res = Integer.parseInt(sb.toString(),2);
            return res;
        }
    }
}
