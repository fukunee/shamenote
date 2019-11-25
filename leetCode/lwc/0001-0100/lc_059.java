package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/10 16:27
 */
public class U59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int level = n%2==0? n/2:n/2+1;
        int start = 1;
        for(int i = 0;i < level; i++){
            start = getOrder(matrix,n,start,i);
        }
        return matrix;
    }

    public int getOrder(int[][] matrix,int n,int start,int level){
        int x = n - level; int y = n - level;
        int i = level, j = level;int max = n*n;

        while (j < y && start <= max)
            matrix[i][j++] = start++;
        i = i + 1; j = j -1;

        while(i < x && start <= max)
            matrix[i++][j] = start++;
        i = i - 1; j = j - 1;

        while(j >= level && start <= max)
            matrix[i][j--] = start++;
        i = i - 1; j = j + 1;

        while(i > level && start <= max)
            matrix[i--][j] = start++;

        return start;
    }

    public static void main(String[] args) {
        new U59().generateMatrix(3);
    }
}
