class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(A[i]<0&&K>0){
                A[i]=-A[i];
                K--;
            }
        }
        Arrays.sort(A);
        if(K%2!=0){
            A[0]=-A[0];
        }
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        return sum;
    }
}