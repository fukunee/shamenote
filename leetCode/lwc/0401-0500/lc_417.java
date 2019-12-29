package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/25 10:27
 */
public class lc_417 {
    int[][] direct = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> lst = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0)
            return lst;
        int x = matrix.length, y = matrix[0].length;
        int[][] v1 = new int[x][y];
        int[][] v2 = new int[x][y];
        LinkedList<int[]> queue = new LinkedList<>();

        //太平洋
        for(int i = 0; i < y; i++) queue.push(new int[]{0, i});
        for(int i = 0; i < x; i++) queue.push(new int[]{i, 0});
        help(queue, matrix, v1);

        //大西洋
        for(int i = 0; i < y; i++) queue.push(new int[]{x - 1, i});
        for(int i = 0; i < x; i++) queue.push(new int[]{i, y - 1});
        help(queue, matrix, v2);

        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(v1[i][j] == 1 && v2[i][j] == 1)
                    lst.add(Arrays.asList(i, j));
            }
        }
        return lst;
    }

    public void help(LinkedList<int[]> queue, int[][] m, int[][] v){
        while(!queue.isEmpty()){
            int[] temp = queue.pop();
            int i = temp[0], j = temp[1];
            v[i][j] = 1;
            for(int[] d : direct){
                int ni = i + d[0];
                int nj = j + d[1];
                if(ni >= 0 && ni < m.length && nj >= 0 && nj < m[0].length && v[ni][nj] == 0 && m[ni][nj] >= m[i][j]){
                    queue.push(new int[]{ni,nj});
                }
            }
        }
    }
}