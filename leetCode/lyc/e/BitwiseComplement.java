package easy;
/*lc_1009*/
public class BitwiseComplement {
    public static void main(String[] args){
        Solution solution = new BitwiseComplement().new Solution();
        int N = 7;
        System.out.print(solution.bitwiseComplement(N));
    }
    class Solution {
        public int bitwiseComplement(int N) {
            String str = Integer.toBinaryString(N);
            int res = 0;
            for(int i = str.length() - 1;i >= 0;i--){
                if(str.charAt(i) == '0'){
                    res += Math.pow(2,str.length() - 1 - i);
                }
            }
            return res;
        }
    }
}
