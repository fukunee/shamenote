package leetcode;

/**
 * @author lwc
 * @date 2019/11/25 23:44
 */
public class lc_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0)
            return false;
        int x = matrix.length, y = matrix[0].length;
        int left = 0, right = y;
        for(int i = 0; i < x; i++){
            if(target < matrix[i][0])
                return false;
            while(left < right){
                int mid = (left + right) / 2;
                if(target == matrix[i][mid]) return true;
                if(target > matrix[i][mid]) left = mid + 1;
                else right = mid;
            }
            right = left;
            left = 0;
        }
        return false;
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        int x = matrix.length-1, y = 0;
        while(x >= 0 && y < matrix[0].length){
            if(target > matrix[x][y])
                y ++;
            else if(target < matrix[x][y])
                x --;
            else
                return true;
        }
        return false;
    }
}
