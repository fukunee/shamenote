package solution2;

/**
 * @author lwc
 * @date 2019/10/16 15:18
 */
public class U73 {
    public void setZeroes(int[][] matrix) {
        int N = Math.max(matrix.length,matrix[0].length);
        int[][] visit = new int[N][2];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0) {
                    visit[i][0] = 1;
                    visit[j][1] = 1;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(visit[i][0] == 1 || visit[j][1] == 1)
                    matrix[i][j] = 0;
            }
        }
    }
}
