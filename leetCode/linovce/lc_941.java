class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<3||A[0]>=A[1]||A[A.length-1]>=A[A.length-2])
            return false;
        
        int f=0;
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1])
                return false;
            if(f==0){
                if(A[i]<A[i+1])
                    continue;
                else
                    f=1;
            }else{
                if(A[i]<A[i+1])
                    return false;
            }
        }
        return true;
    }
}