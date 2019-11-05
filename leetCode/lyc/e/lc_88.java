/*Merge Sorted Array*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                res[k++]=nums1[i];
                i++;
            }
            else{
                res[k++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            res[k++]=nums1[i++];
        }
        while(j<n){
            res[k++]=nums2[j++];
        }
        
        int p=0;
        for(int c:res){
            nums1[p++]=c;
        }
    }
}