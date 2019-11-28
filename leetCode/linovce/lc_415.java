class Solution {
    public String addStrings(String num1, String num2) {
        Map<Character,Integer> map = new HashMap<>();
        char c = '0';
        for(int i=0;i<=9;i++){
            map.put(c,i);
            c++;
        }        
        
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();        
        for(int i=0;i<num1.length();i++){
            stack1.push(num1.charAt(i));
        }
        for(int i=0;i<num2.length();i++){
            stack2.push(num2.charAt(i));
        }
        
        int t=0;
        String r="";
        while(!stack1.empty()&&!stack2.empty()){
            int n = map.get(stack1.pop())+map.get(stack2.pop())+t;
            t=0;
            if(n>=10){
                t=1;
                n=n%10;
            }
            r=n+r;
        }
        class Solution {
    public String addStrings(String num1, String num2) {
        Map<Character,Integer> map = new HashMap<>();
        char c = '0';
        for(int i=0;i<=9;i++){
            map.put(c,i);
            c++;
        }        
        
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();        
        for(int i=0;i<num1.length();i++){
            stack1.push(num1.charAt(i));
        }
        for(int i=0;i<num2.length();i++){
            stack2.push(num2.charAt(i));
        }
        
        int t=0;
        String r="";
        while(!stack1.empty()&&!stack2.empty()){
            int n = map.get(stack1.pop())+map.get(stack2.pop())+t;
            t=0;
            if(n>=10){
                t=1;
                n=n%10;
            }
            r=n+r;
        }
        
        while(!stack1.empty()){
            int n = map.get(stack1.pop())+t;
            t=0;
            if(n>=10){
                t=1;
                n=n%10;
            }
            r=n+r;
        }
        while(!stack2.empty()){
            int n = map.get(stack2.pop())+t;
            t=0;
            if(n>=10){
                t=1;
                n=n%10;
            }
            r=n+r;
        }
        if(t!=0){
            r=1+r;
        }
        
        return r;
    }
}
        while(!stack1.empty()){
            int n = map.get(stack1.pop())+t;
            t=0;
            if(n>=10){
                t=1;
                n=n%10;
            }
            r=n+r;
        }
        while(!stack2.empty()){
            int n = map.get(stack2.pop())+t;
            t=0;
            if(n>=10){
                t=1;
                n=n%10;
            }
            r=n+r;
        }
        if(t!=0){
            r=1+r;
        }
        
        return r;
    }
}