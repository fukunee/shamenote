package easy;
/*lc_169*/
import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args){
        Solution solution = new MajorityElement().new Solution();
        int[] nums = new int[]{2,2,1,1,2,3};
        System.out.print(solution.majorityElement(nums));
    }
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int res = 0;
            int temp = 0;
            for (int num :nums){
                int count = map.getOrDefault(num,0) + 1;
                map.put(num,count);
                if(count > temp){
                    res = num;
                    temp = count;
                }

            }
            return res;
            /*solution two*/
            /*Arrays.sort(nums);
            return nums[nums.length / 2];*/
        }
    }
}
