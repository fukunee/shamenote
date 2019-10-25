class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int t = map.get(nums[i]).get(0)+1;
                List<Integer> list = new ArrayList<Integer>();
                list.add(t);
                list.add(map.get(nums[i]).get(1));
                list.add(i);
                map.put(nums[i],list);
            }else{
                List<Integer> list = new ArrayList<Integer>();
                list.add(1);
                list.add(i);
                list.add(i);
                map.put(nums[i],list);
            }
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
            if(max<entry.getValue().get(0)){
                max=entry.getValue().get(0);                
                min=entry.getValue().get(2)+1-entry.getValue().get(1);
            }else if(max==entry.getValue().get(0)){
                if(min>entry.getValue().get(2)+1-entry.getValue().get(1)){
                    min=entry.getValue().get(2)+1-entry.getValue().get(1);
                }
            }
        }
        
        return min;
    }
}