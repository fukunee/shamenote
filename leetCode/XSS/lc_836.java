public class lc_836 {
    public static void main(String[] args) {
        int rec1[]=new int[]{0,0,2,2};
        int rec2[]=new int[]{1,1,3,3};
        System.out.println(String.valueOf(new Solution().isRectangleOverlap(rec1,rec2)));
    }
    static class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            return !(rec1[2] <= rec2[0] ||rec1[3] <= rec2[1] ||rec1[0] >= rec2[2] ||rec1[1] >= rec2[3]);
        }
    }
}
