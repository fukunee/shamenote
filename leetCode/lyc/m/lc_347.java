class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }    
       PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a) - map.get(b);
            }
        });
        for (Integer num : map.keySet()){
            if(que.size()<k){
                que.add(num);
            }else if(map.get(num)>map.get(que.peek())){
                que.remove();
                que.add(num);
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!que.isEmpty()) {
            res.add(que.remove());
        }
        return res;
    }
}