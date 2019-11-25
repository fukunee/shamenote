package solution2;

public class U11 {
    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 1; i < height.length; i++) {
            res = Math.max(res, area(height, i));
        }
        return res;
    }

    public int area(int[] h, int right) {
        int res = 0;
        for (int i = 0; i < right; i++) {
            res = Math.max(res, (right - i) * Math.min(h[right], h[i]));
        }
        return res;
    }
}
