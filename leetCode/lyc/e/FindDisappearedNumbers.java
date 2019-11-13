package easy;
import java.util.ArrayList;
import java.util.List;
/*lc_448*/
public class FindDisappearedNumbers {
    public static void main (String[] args){
        Solution solution = new FindDisappearedNumbers().new Solution();
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        System.out.print(solution.findDisappearedNumbers(nums));
    }
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            if(0 == nums.length ){
                return  new ArrayList<>(0);
            }
            List<Integer> list = new ArrayList<>();
            int j = 0;
            while (j < nums.length){
                int n = Math.abs(nums[j]) - 1;
                if(nums[n] > 0){
                    nums[n] = -nums[n];
                }

                j++;
            }
            for(int i = 0; i < nums.length;i++){
                if(nums[i] > 0){
                    list.add(i + 1);
                }
            }
            return  list;
        }
    }
}
