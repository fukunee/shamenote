/*two sum*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        if(nums.length<2){
            return res;
        }
        Map<Integer,Integer> map = new HashMap();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int tag=target-nums[i];
            if(map.containsKey(tag)){
                res[0]=i;
                res[1]=map.get(tag);
                break;
                
            }
            map.put(nums[i],i);
        }
       return res;
    }
}