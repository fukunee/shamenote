class Solution {
    public boolean judgeSquareSum(int c) {
        int n = (int)Math.sqrt(c);
        
        int f=0;
        int l=n;
        
        while(f<=l){
            if(f*f+l*l==c)
                return true;
            else if(f*f+l*l>c)
                l--;
            else if(f*f+l*l<c)
                f++;
        }
        return false;
    }
}