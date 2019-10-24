/*3sum*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length<3){
            return res;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
           if(nums[i]>0){
               break;
           }
           if(i>0&&nums[i]==nums[i-1]){
               continue;
           }
            int tag=0-nums[i];
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if((nums[j]+nums[k])==tag){
                    List<Integer> list=Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(list);
                    while(j<k&&nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k&&nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;k--;
                }else if(nums[j]+nums[k]>tag){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return res;
    }
}