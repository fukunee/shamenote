/*Backspace String Compare*/
class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1=getstack(S);
        Stack<Character> stack2=getstack(T);
        if(stack1.empty()&&stack2.empty()){
            return true;
        }else if(stack1.empty()||stack2.empty()){
            return false;
        }
        if(stack1.size()!=stack2.size()){
            return false;
        }
        while(!stack1.empty()&&!stack2.empty()){
            if(stack1.pop()!=stack2.pop()){
                return false;
            }
        }
        return true;
        
    }
    public Stack<Character> getstack(String s){
        Stack<Character> stack=new Stack<Character>();
        for(char c: s.toCharArray()){
            if(!stack.empty()&&c=='#'){
                stack.pop();
            }else if(c!='#'){
                stack.push(c);
            }
        }
        return stack;
    }
}