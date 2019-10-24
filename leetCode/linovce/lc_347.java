class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        List<Integer> r = new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int t = map.get(nums[i])+1;
                map.put(nums[i],t);
            }
            else
                map.put(nums[i],1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        for(Map.Entry<Integer,Integer> entry : list){
            System.out.println(entry.getValue());
            if(k!=0){
                r.add(entry.getKey());
                k--;
            }
        }
        return r;
    }
    
}