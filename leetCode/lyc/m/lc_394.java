/*Decode String*/
class Solution {
    public String decodeString(String s) {
        Stack<String> stacks=new Stack<>();
        Stack<Integer> stackn=new Stack<>();
        int num=0;
        String res="";
        for(char c:s.toCharArray()){
            if(c<='9'&&c>='0'){
                num=num*10+(c-'0');
                
            }else if(c=='['){
                stackn.push(num);
                num=0;
                stacks.push(res);
                res="";
            }
            else if(c==']'){
                num=stackn.pop();
                String str=res;
                for(int i=1;i<num;i++){
                    
                    res+=str;
                }
                res=stacks.peek()+res;
                stacks.pop();
            }else{
                res+=c;
            }
        }
        return res;
    }
}