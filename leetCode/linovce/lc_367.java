class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
            return true;
        int n=0;
        for(int i=1;i<=num/2;i++){
            n+=(2*i-1);
            if(n==num)
                return true;
            if(n>num)
                return false;
        }
        return false;
    }
}