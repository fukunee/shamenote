package easy;
/*lc_191*/
public class Numberof1bits {
    public static void main(String[] args){
        Solution solution = new Numberof1bits().new Solution();
        int n = 00000000000000000000000000001011;
        System.out.print(solution.hammingWeight(n));
    }
    public class Solution {
        public int hammingWeight(int n) {
            String s = Integer.toBinaryString(n);
            int res = 0;
            for(char c :s.toCharArray()){
                if(c == '1'){
                    res++;
                }
            }
            return res;
        }
    }
}
