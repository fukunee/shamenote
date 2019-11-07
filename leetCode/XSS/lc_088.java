public class lc_088 {
    public static void main(String[] args) {
        //合并两个有序数组,*,该法需要额外空间，可以从后往前合并数组

    }
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int n1[]=new int[m];
            for(int i=0;i<m;i++)
            {
                n1[i]=nums1[i];
            }
            int len=Math.min(m,n);
            int p=0,p1=0,p2=0;
            while(p1<m&&p2<n)
            {
                if(n1[p1]<nums2[p2])
                {
                    nums1[p++]=n1[p1++];
                }
                else
                {
                    nums1[p++]=nums2[p2++];
                }
            }
            while (p1<m)
            {
                nums1[p++]=n1[p1++];
            }
            while (p2<n)
            {
                nums1[p++]=nums2[p2++];
            }
        }
    }
}
