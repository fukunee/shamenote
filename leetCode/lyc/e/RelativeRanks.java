package easy;

import java.util.Arrays;

import java.util.HashMap;

/*lc_506*/
public class RelativeRanks {
    public static void main(String[] args){
        Solution solution = new RelativeRanks().new Solution();
        int[] nums = new int[]{5,3,4,1,2};
        System.out.print(solution.findRelativeRanks(nums));
    }
    class Solution {
        public String[] findRelativeRanks(int[] nums) {
            int[] copy= new int[nums.length];

            for(int i=0;i<nums.length;i++){
                copy[i]= nums[i];
            }
            Arrays.sort(copy);
            int m = 0;
            int p = copy.length - 1;
            while(p > m){
                int temp = copy[m];
                copy[m]=copy[p];
                copy[p]=temp;
                m++;
                p--;
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            String[] res = new String[nums.length];
            int n =nums.length;
            for (int j = 0;j < copy.length;j++){
                map.put(copy[j],j+1);
            }
            int k = 0;
            for(int num : nums){
                String s ="";
                if(map.get(num) == 1){
                    s = "Gold Medal";
                }else if(map.get(num) == 2){
                    s = "Silver Medal";
                }else if(map.get(num) == 3){
                    s =  "Bronze Medal";
                }else{
                    s = String.valueOf(map.get(num));
                }
                res[k++] = s;
            }
            return res;
        }
    }
}
