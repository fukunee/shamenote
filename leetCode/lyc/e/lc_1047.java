/*Remove All Adjacent Duplicates In String */
class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack=new Stack<>();
        for(char c :S.toCharArray()){
            if(stack.isEmpty()||stack.peek()!=c){
                stack.push(c);
            }else{
                stack.pop();
            }
        }
        StringBuilder res=new StringBuilder();
        while(!stack.isEmpty()){
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}