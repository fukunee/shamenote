/*Simplify Path*/
class Solution {
    
    public String simplifyPath(String path) {
        String[] str=path.split("/");
        Stack<String> stack=new Stack();
        for(String word:str){
            if(word.equals("..")&&!stack.isEmpty()){
                stack.pop();
            }else if(word.equals(".")||(word.equals("..")&&stack.isEmpty())||word.equals("")){
                continue;
            }else{
                stack.push(word);
            }
        }
        String res="";
        if(stack.isEmpty()){
            return "/";
        }else{
            while(!stack.isEmpty()){
                res="/"+stack.pop()+res;
            }
        }
        return res;
    }
}