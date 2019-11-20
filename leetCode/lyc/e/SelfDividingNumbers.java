package easy;
/*lc_728*/
import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main (String[] args){
        Solution solution = new SelfDividingNumbers().new Solution();
        int left = 1;
        int right = 22;
        System.out.print(solution.selfDividingNumbers(left,right));
    }
    class Solution {
        public List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer> list = new ArrayList<>();
            for(int i = left;i <= right;i++){
                if(isSelfDividingNumber(i))
                    list.add(i);
            }
            return list;
        }
        private boolean isSelfDividingNumber(int num){
            if(num % 10 == 0)
                return false;
            if(num < 10)
                return true;
            int copy = num;
            while(copy != 0){
                int temp = copy % 10;
                if(temp == 0)
                    return false;
                if(num % temp != 0)
                    return false;
                copy /= 10;
            }
            return true;
        }
    }
}
