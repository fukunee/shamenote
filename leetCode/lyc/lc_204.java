class Solution {
    public int countPrimes(int n) {
        boolean[] res=new boolean[n];
        Arrays.fill(res,true);
        if(n<=1){
            return 0;
        }
        res[0]=false;
        res[1]=false;
        int sum=0;
        for(int i=2;i<n;i++){
            if(res[i]){
                for(int j=2*i;j<n;j+=i){
                    res[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(res[i]){
                sum++;
            }
        }
        return sum;
    
    }
}