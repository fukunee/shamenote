class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] res=new int[Math.min(len1,len2)];
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i=0;i<len1;i++){
            if(!set1.contains(nums1[i])){
                set1.add(nums1[i]);
            }
        }
        for(int i=0;i<len2;i++){
            if(!set2.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }
        int k=0;
        for(int set:set1){
            if(set2.contains(set)){
                res[k]=set;
                k++;
            }
        }
        return Arrays.copyOf(res, k);
    }
}