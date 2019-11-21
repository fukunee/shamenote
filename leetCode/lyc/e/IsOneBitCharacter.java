package easy;
/*lc_717*/
public class IsOneBitCharacter {
    public static void main (String[] args){
        Solution solution = new IsOneBitCharacter().new Solution();
        int[] bits = new int[]{1};
        System.out.print(solution.isOneBitCharacter(bits));
    }
    class Solution {
        public boolean isOneBitCharacter(int[] bits) {
            if(bits[bits.length - 1] == 1){
                return false;
            }
            int res = -1;
            for(int i = 0; i < bits.length;i++){
                if(bits[i] == 1){
                    ++i;
                }else{
                    res = i;
                }
            }
            return res == bits.length - 1;
        }
    }
}
