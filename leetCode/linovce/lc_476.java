class Solution {
    public int findComplement(int num) {
        int r=0;
        int t=1;

        Stack<Integer> stack = new Stack<>();
        while(num/2!=0){
            stack.push(num%2);
            num=num/2;
            t=t*2;
        }
        if(num==1){
            stack.push(num);
        }else{
            t=t/2;
        }
            
        if(stack.empty())
            return 1;
        while(!stack.empty()){
            if(stack.pop()==0){
                r=r+t;
            }
            t=t/2;
        }
        return r;
    }
}