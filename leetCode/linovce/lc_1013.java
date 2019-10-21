class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int num=0;
        for(int i=0;i<A.length;i++){
            num+=A[i];
        }
        
        if(num%3!=0)
            return false;
        
        num/=3;
        
        int f=0;
        int n=0;
        for(int i=0;i<A.length;i++){
            n+=A[i];
            if(n==num){
                n=0;
                f++;
            }
        }
        if(f!=3)
            return false;
        return true;
    }
}