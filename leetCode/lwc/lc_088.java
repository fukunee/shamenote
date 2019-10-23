package solution2;

/**
 * @author lwc
 * @date 2019/10/20 19:01
 */
public class U88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m = m - 1;
        n = n - 1;
        while(k >= 0){
            if(m >= 0 && n >= 0){
                if(nums1[m] >= nums2[n]) nums1[k--] = nums1[m--];
                else nums1[k--] = nums2[n--];
            }
            else if(m >= 0){
                nums1[k--] = nums1[m--];
            }
            else{
                nums1[k--] = nums2[n--];
            }
        }
    }
}
