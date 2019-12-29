package leetcode;

/**
 * @author lwc
 * @date 2019/12/24 10:11
 */
public class lc_413 {
    public int numberOfArithmeticSlices(int[] A) {
        int res = 0;
        for(int i = 0; i < A.length - 2; i++){
            int index = getIndex(A, i);
            if(index - i < 2) continue;
            else{
                res += count(index - i + 1);
                i = index - 1;
            }
        }
        return res;
    }

    public int getIndex(int[] A, int i){
        int interval = A[++i] - A[i-1];
        while(i < A.length - 1 && A[i+1] - A[i] == interval) i++;
        return i;
    }

    public int count(int len){
        int res = 0;
        for(int i = 3; i <= len; i++){
            for(int j = 0; j + i <= len; j++)
                res += 1;
        }
        return res;
    }
}
