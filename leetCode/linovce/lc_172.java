class Solution {
    public int trailingZeroes(int n) {
    
        int num=0;
        while(n>=5){
            n/=5;
            num+=n;
        }
        return num;
    }
}