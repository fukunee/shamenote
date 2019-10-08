class Solution {
    public int bitwiseComplement(int N) {
        if(N==0)
            return 1;
        
        int n=N;
        int r=0;
        int a=1;
        while(n/2!=0){
            int t = n%2;
            if(t==0){
                r+=a*1;
            }
            a*=2;
            n=n/2;
        }
        if(n==0)
            r+=a*1;
        return r;
    }
}