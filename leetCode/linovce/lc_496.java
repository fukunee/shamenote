class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int f=0;
            for(int j=0;j<nums2.length;j++){
                if(f==0){
                    if(nums2[j]==nums1[i])
                        f=1;
                }else if(f==1){
                    if(nums2[j]>nums1[i]){
                        nums1[i]=nums2[j];
                        f=2;
                        break;
                    }
                        
                }
                
            }
            if(f!=2)
                nums1[i]=-1;
        }
        
        return nums1;
    }
}