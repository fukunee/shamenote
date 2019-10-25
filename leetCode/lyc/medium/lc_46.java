class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list= new ArrayList<>();
        backstrack(list,new ArrayList<>(),nums);
        return list;
    }
    public void backstrack(List<List<Integer>> list,List<Integer> tag,int[] nums){
        if(tag.size()==nums.length){
            list.add(new ArrayList<>(tag));
            return;
        }else{
            for(int i=0;i<nums.length;i++){
                if(tag.contains(nums[i])){
                    continue;
                }
                tag.add(nums[i]);
                backstrack(list,tag,nums);
                tag.remove(tag.size()-1);
            }
        }
    }
}