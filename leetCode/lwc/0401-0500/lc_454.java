package leetcode;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2020/1/27 20:32
 */
public class lc_454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        HashMap<Integer, Integer> h2 = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                h1.put(A[i]+B[j], h1.getOrDefault(A[i]+B[j], 0) + 1);
            }
        }
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < D.length; j++){
                h2.put(C[i]+D[j], h2.getOrDefault(C[i]+D[j], 0) + 1);
            }
        }

        int count = 0;
        for(int key : h1.keySet()){
            count += h1.get(key) * h2.getOrDefault(0 - key, 0);
        }
        return count;
    }
}
