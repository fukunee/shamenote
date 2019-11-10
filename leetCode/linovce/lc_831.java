class Solution {
    public String maskPII(String S) {
        List<Character> list = new ArrayList<>();
       
        int num=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('||S.charAt(i)==')'||S.charAt(i)==' ')
                continue;
            if(S.charAt(i)>='0'&&S.charAt(i)<='9')
                num++;
            list.add(S.charAt(i));
        }
        
        if(list.contains('@')){
            String r="";
            int index = list.indexOf('@');
            
            if(list.get(0)>='A'&&list.get(0)<='Z'){
                char t = Character.toLowerCase(list.get(0));            
                list.set(0,t);
            }
            
            if(list.get(index-1)>='A'&&list.get(index-1)<='Z'){
                char t = Character.toLowerCase(list.get(index-1));                
                list.set(index-1,t);
            }
            
            r=r+list.get(0)+"*****"+list.get(index-1);
            
            for(int i=index;i<list.size();i++){
                if(list.get(i)>='A'&&list.get(i)<='Z'){
                    char t = Character.toLowerCase(list.get(i));                
                    r=r+t;
                }
                else r=r+list.get(i);
            }
            return r;
            
        }else{
            int f=0;
            String t = "";
            
            for(int i=list.size()-1;i>=0;i--){
                if(list.get(i)>='0'&&list.get(i)<='9'){
                    t=list.get(i)+t;
                    f++;
                }
                if(f==4){
                    break;
                }
            }
            t="***-***-"+t;
            if(num==10){
                return t;
            }else{
                String s = "+";
                num=num-10;
                while(num!=0){
                    s=s+"*";
                    num--;
                }
                s=s+"-";
                return s+t;
            }
            
        }
    }
}