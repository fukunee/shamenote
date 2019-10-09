package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/9 15:14
 */
public class U54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rs = new ArrayList<>();
        if(matrix.length < 1) return rs;
        int[][]visit = new int[matrix.length][matrix[0].length];
        int min = Math.min(matrix.length,matrix[0].length);
        int n = min%2==0? min/2:min/2+1;
        for(int i = 0;i < n; i++){
            getOrder(rs,matrix,i,visit);
        }
        return rs;
    }

    public void getOrder(List<Integer> rs,int[][] matrix,int n,int[][] visit){
        int x = matrix.length-n, y = matrix[0].length-n;
        int i = n, j = n;
        while(j < y && visit[i][j]==0) {
            visit[i][j]=1;
            rs.add(matrix[i][j++]);
        }
        i = i + 1; j = j - 1;
        while(i < x && visit[i][j]==0) {
            visit[i][j]=1;
            rs.add(matrix[i++][j]);
        }
        i = i - 1; j = j - 1;
        while(j >= n && visit[i][j]==0) {
            visit[i][j]=1;
            rs.add(matrix[i][j--]);
        }
        i = i - 1; j = j + 1;
        while(i >= n && visit[i][j]==0){
            visit[i][j]=1;
            rs.add(matrix[i--][j]);
        }
    }

    public static void main(String[] args) {
        System.out.println(new U54().spiralOrder(new int[][]{{1,2,3}}));
    }
}
