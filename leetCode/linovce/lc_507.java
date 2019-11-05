class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1)
            return false;
        int sum = 1;
        
        int min=2;
        
        for(int i=2;i<num/min;i++){
            if(num%i==0){
                if(sum>=num)
                    return false;
                sum=sum+i+num/i;
                min=i;
            }
            
        }
        
        if(num==sum)
            return true;
        return false;
    }
}