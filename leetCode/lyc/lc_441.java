class Solution {
    public int arrangeCoins(int n) {
        double m=n;
        long k=(long)Math.sqrt((double)(m * 2));
        
        if((k*k+k)>m*2){
            return (int)k-1;
        }
        return (int)k;
    }
  
}