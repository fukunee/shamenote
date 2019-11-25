package solution2;

public class U4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] rs = MergeSortedArrays(nums1, nums2);
        int n = rs.length;
        if (n % 2 == 0) return (rs[n / 2 - 1] + rs[n / 2]) / 2.0;
        else return rs[n / 2];
    }

    public int[] MergeSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] rs = new int[m + n];
        int i = 0, j = 0;
        while (i < m || j < n) {
            while (i < m && j == n || i < m && j < n && nums1[i] <= nums2[j])
                rs[i + j] = nums1[i++];
            while (i == m && j < n || i < m && j < n && nums2[j] <= nums1[i])
                rs[i + j] = nums2[j++];
        }
        return rs;
    }
}
