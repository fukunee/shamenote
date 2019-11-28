package leetcode;

/**
 * @author lwc
 * @date 2019/11/28 9:21
 */
public class lc_300 {
    public int lengthOfLIS(int[] nums) {
        int max = 0;
        int[] v = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            v[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j])
                    v[i] = Math.max(v[i], v[j]+1);
            }
            max = Math.max(v[i], max);
        }
        return max;
    }

    public int lengthOfLIS2(int[] nums) {
        int[] tails = new int[nums.length];
        int res = 0;
        for(int num : nums) {
            int i = 0, j = res;
            while(i < j) {
                int m = (i + j) / 2;
                if(tails[m] < num) i = m + 1;
                else j = m;
            }
            tails[i] = num;
            if(res == j) res++;
        }
        return res;
    }

}
