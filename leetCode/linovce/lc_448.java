class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<Integer>();
        int t=1;
        for(int i=0;i<nums.length&&t<=nums.length;){
            if(nums[i]==t){
                i++;
                t++;
            }else if(nums[i]<t){
                i++;
            }else{
                list.add(t);
                t++;
            }
        }
        while(t<=nums.length){
            list.add(t);
            t++;
        }
        return list;
    }
}