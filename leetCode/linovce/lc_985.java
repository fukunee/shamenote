class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int num=0;
        for(int j=0;j<A.length;j++){
            if(A[j]%2==0)
                num+=A[j];
        }
        
        int [] r = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            if(A[queries[i][1]]%2==0){
                if(queries[i][0]%2==0)
                    num=num+queries[i][0];
                else
                    num-=A[queries[i][1]];
            }
            else{
                if(queries[i][0]%2!=0)
                    num=num+queries[i][0]+A[queries[i][1]];
            }
            r[i]=num;
            A[queries[i][1]]+=queries[i][0];
        }
        return r;
    }
}