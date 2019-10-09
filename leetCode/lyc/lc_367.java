class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0;
        int right=46340;
        while(left<=right){
            int mid=(left+right)>>>1;
            if((double)(mid*mid)==num){
                return true;
            }else if((double)(mid*mid)>num){
                right=mid-1;
            }else if((double)(mid*mid)<num){
                left=mid+1;
            }
        }
        return false;
    }
}