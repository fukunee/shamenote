class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] t = Arrays.copyOf(nums,nums.length);
        Arrays.sort(t);
        int a=-1,b=-1;
        for(int i=0,j=nums.length-1;i<j;){
            if(nums[i]==t[i])
                i++;
            else
                a=i;
            if(nums[j]==t[j])
                j--;
            else
                b=j;
            if(a!=-1&&b!=-1)
                break;
        }
        if(a==-1&&b==-1)
            return 0;
        return b-a+1;
    }
}