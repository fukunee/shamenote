class Solution {
    public int reverse(int x) {
        if(x==0)
            return 0;
        int n=x;

        Stack<Integer> stack = new Stack<>();

        while(n/10!=0){
            System.out.println(Math.abs(n%10));
            stack.push(Math.abs(n%10));
            n/=10;

        }
        System.out.println(n);
        
        stack.push(Math.abs(n));

        int i=1,r=0;
        while(!stack.empty()){
            if(i<100000000){
                r=r+stack.pop()*i;
                i=i*10;
            }else{
                if(x>0&&i>Integer.MAX_VALUE/stack.peek()||x<0&&i*(-1)<Integer.MIN_VALUE/stack.peek())
                    return 0;
                
                if(x>0&&i*stack.peek()>Integer.MAX_VALUE-r||x<0&&(-1)*i*stack.peek()<Integer.MIN_VALUE+r)
                    return 0;
                
                r=r+stack.pop()*i;
                i=i*10;
            }
        }
        if(x<0)
            r*=(-1);

        return r;
    }
}