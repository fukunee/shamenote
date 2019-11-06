/*Baseball Game */
class Solution {
    public int calPoints(String[] ops) {
        int[] stack=new int[ops.length];
        int i=0;
        for(String str:ops){
            if(str.equals("+")) {
                stack[i]=stack[i-1]+stack[i-2];
                i++;
            }else if(str.equals("D")) {
                stack[i]=2*stack[i-1];
                i++;
            }else if(str.equals("C")) {
                stack[i-1]=0;
                i--;
            }else {
                stack[i]=Integer.valueOf(str);
                i++;
            }
                          
        }
        int res=0;
        for(int num:stack){
            res+=num;
        }
        return res;
    }
}