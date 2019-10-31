/*K-diff Paris in an Array*/
class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums.length==0||k<0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        Arrays.sort(nums);
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int num:map.keySet()){
            if(k==0){
                if(map.get(num)>1){
                    count+=1;
                }
            }else if(map.containsKey(num+k)){
                count+=1;
            }
        }
        return count;
    }
}