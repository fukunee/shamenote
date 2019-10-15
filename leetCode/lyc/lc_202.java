class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(true){        
            n=findsquare(n);
            if(n==1){
                return true;
            }
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);    
            }
          
        }
       
    }
    public int findsquare(int num){
        int sum=0;
        while(num!=0){
            sum+=(num%10)*(num%10);
            num=num/10;
        }
        return sum;
    }
}