class Solution {
    public boolean isUgly(int num) {
        while(num/5!=0){
            if(num%5!=0)
                break;
            num/=5;
        }
        
        while(num/3!=0){
            if(num%3!=0)
                break;
            num/=3;
        }
        
        while(num/2!=0){
            if(num%2!=0)
                break;
            num/=2;
        }
        
        if(num==1)
            return true;
        return false;
    }
}