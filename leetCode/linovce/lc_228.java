class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        
        
        for(int i=0;i<nums.length;){
            int l = i,r=i;
            for(int j=i+1;j<nums.length+1;j++,i++){
                
                if(j==nums.length||nums[j]-nums[i]!=1){
                    
                    r=j-1;
                    break;
                }                    
            }
            if(l==r){
                list.add(Integer.toString(nums[i]));
            }else if(l!=r){
                list.add(Integer.toString(nums[l])+"->"+Integer.toString(nums[r]));
            }
            i=r+1;
        }
        
        return list;
    }
}