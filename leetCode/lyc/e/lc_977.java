/*Squares of a Sorted Array*/
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res=new int[A.length];
        for(int i=0;i<A.length;i++){
            res[i]=A[i]*A[i];
        }
        Arrays.sort(res);
        return res;
    }
}