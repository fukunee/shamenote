class Solution {
    public String[] findRelativeRanks(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
      
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        String[] r = new String[nums.length];
        int a=nums.length;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(a==1){
                r[entry.getValue()]="Gold Medal";
                a--;
            }                
            else if(a==2){
                r[entry.getValue()]="Silver Medal";
                a--;
            }
            else if(a==3){
                r[entry.getValue()]="Bronze Medal";
                a--;
            }else{
                r[entry.getValue()]=String.valueOf(a);
                a--;
            }
        }
        return r;
    }
}