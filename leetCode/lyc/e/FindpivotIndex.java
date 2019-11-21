package easy;
/*lc_724*/
public class FindpivotIndex {
    public static void main(String[] args){
        Solution solution = new FindpivotIndex().new Solution();
        int[] nums = new int[]{1, 2, 3};
        System.out.print(solution.pivotIndex(nums));
    }
    class Solution {
        public int pivotIndex(int[] nums) {
            if (nums.length == 0 ||nums.length ==2){
                return -1;
            }
            if(nums.length == 1){
                return 0;
            }
            int[] sum = new int[nums.length];
            int temp = 0;
            for(int i = 0;i < nums.length;i++){
                temp += nums[i];
                sum[i] = temp;
            }
            for(int i = 1; i < sum.length - 1;i++){
                if(i == 0 && sum[sum.length - 1] - sum[0] == 0){
                    return 0;
                }
                if(i == sum.length - 1 && sum[i - 1] == 0){
                    return i;
                }
                if(i != 0 && i != sum.length - 1 && sum[i - 1] == (sum[sum.length - 1] - sum[i])){
                    return i;
                }
            }
            return -1;
        }
    }
}
