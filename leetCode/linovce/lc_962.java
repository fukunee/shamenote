class Solution {
    public int maxWidthRamp(int[] A) {
        int max=0;
        for(int i=0;i<A.length;i++){
            int j=A.length-1;
            while(i<j){
               if(A[i]<=A[j])
                   break;
                j--;
            }
            if(j-i>max)
                max=j-i;
          
        }
        return max;
    }
}