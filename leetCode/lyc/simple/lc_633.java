class Solution {
    public boolean judgeSquareSum(int c) {
        int i=0;
        int j=(int)(Math.sqrt(c)+1);
        while(i<=j){
            if(i*i+j*j>c) j--;
            if(i*i+j*j<c) i++;
            else if(i*i+j*j==c){
               
                return true;
            }
        }
        return false;
              
    }
}