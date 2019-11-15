package easy;

import java.util.HashMap;

/*lc_860*/
public class LemonadeChange {
    public static void main (String[] args){
        Solution solution = new LemonadeChange().new Solution();
        int[] bills = new int[]{5,5,5,5,20,20,5,5,5,5};
        System.out.print(solution.lemonadeChange(bills));
    }
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            if(bills[0] != 5){
                return false;
            }
            int five = 0;
            int ten = 0;

            for(int i = 0;i < bills.length;i++){
                if(bills[i] == 5){
                    five++;
                }else if(bills[i] == 10){
                    ten++;
                    five--;
                }else{
                    if(ten > 0){
                        ten--;
                        five--;

                    }else{
                        five -= 3;
                    }
                }
                if (five < 0){
                    return  false;
                }
            }
            return true;
        }
    }
}
