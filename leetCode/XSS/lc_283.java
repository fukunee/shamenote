public class lc_283 {
    //移动零
    public static void main(String[] args) {

    }
    static  class Solution {
        public void moveZeroes(int[] nums) {
            int k=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    k++;
                }
                else
                {
                    nums[i-k]=nums[i];
                }
            }
            for(int j=nums.length-k;j<nums.length;j++)
            {
                nums[j]=0;
            }
        }
    }
}
