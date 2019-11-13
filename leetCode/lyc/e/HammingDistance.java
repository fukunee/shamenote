package easy;
/*lc_461*/
public class HammingDistance {
    public static void  main(String[] args){
        Solution solution = new HammingDistance().new Solution();
        int x = 1;
        int y = 4;
        System.out.print(solution.hammingDistance(x,y));
    }
    class Solution {
        public int hammingDistance(int x, int y) {
            int z = x ^ y;
            String s = Integer.toBinaryString(z);
            int count = 0;
            for(char c : s.toCharArray()){
                if(c == '1'){
                    count++;
                }
            }
            return count;
        }
    }
}
