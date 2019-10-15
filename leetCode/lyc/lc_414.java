class Solution {
    public int thirdMax(int[] nums) {
        ArrayList res=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(!res.contains(nums[i])){
                res.add(nums[i]);
            }
        }
        int n=res.size();
        Collections.sort(res);
      
        if(n<3){
            return (int)res.get(n-1);
        }
        
        return (int)res.get(n-3);
    }
}