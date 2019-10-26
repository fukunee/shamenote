class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        long left=0;
        long right=x/2+1;
        while(left<right){
            long mid=(left+right+1)>>>1;
            long num=mid*mid;
            if(num>x){
                right=mid-1;
            }else{
                left=mid;
            }
        }
        return (int)left;
    }
}