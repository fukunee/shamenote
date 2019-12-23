import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lc_354 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int maxEnvelopes(int[][] envelopes) {
            int n = envelopes.length;
            // 按宽度升序排列，如果宽度一样，则按高度降序排列
            Arrays.sort(envelopes, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return a[0]==b[0]?b[1]-a[1]:a[0]-b[0];
                }
            });
            // 对高度数组寻找 LIS
            int[] height = new int[n];
            for (int i = 0; i < n; i++)
                height[i] = envelopes[i][1];
            //将问题降维变为寻找最长递增子序列,建议使用dp找最长子序列的长度，见lc_300
            return lengthOfLIS(height);
        }

        private int lengthOfLIS(int[] height) {
            //贪心+二分维护一个low数组
            int n=height.length;
            int inser=0;
            int low[]=new int[n];//low[i]表示当前前i项最大值
            for(int i=0;i<n;i++)
            {
                int p=height[i];int left=0,right=inser;
                while (left < right) {//找到第一个大于p的位置
                    int mid = (left + right) / 2;
                    if (low[mid] >= p)
                        right = mid;
                    else
                        left = mid + 1;
                }
                if(left==inser)inser++;//p比low【i】都大，最长子序列++
                low[left]=p;
            }
            return inser;

        }
    }
}
