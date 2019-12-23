package leetcode;

import java.util.PriorityQueue;

/**
 * @author lwc
 * @date 2019/12/16 9:56
 */
public class lc_378 {
    public int kthSmallest(int[][] matrix, int k) {
        int x = matrix.length;
        int y = matrix[0].length;
        PriorityQueue<int[]> queue = new PriorityQueue<>((v1,v2)->v1[2]-v2[2]);
        for(int j = 0; j < y; j++) queue.offer(new int[]{0, j, matrix[0][j]});
        int[] v = new int[]{0, 0, -1};
        while(!queue.isEmpty() && k > 0){
            k--;
            v = queue.poll();
            if(v[0] + 1 < x) queue.offer(new int[]{v[0]+1, v[1], matrix[v[0]+1][v[1]]});
        }
        return v[2];
    }
}
