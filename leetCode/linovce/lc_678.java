class Solution {
    public boolean checkValidString(String s) {
        List<T> list = new ArrayList<T>();
        List<T> l = new ArrayList<T>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                T t = new T('(',i);
                list.add(t);
            }                
            else if(s.charAt(i)=='*'){
                T t = new T('*',i);
                l.add(t);
            }else if(s.charAt(i)==')'){
                if(list.size()!=0)
                    list.remove(list.size()-1);
                else if(l.size()>0)
                    l.remove(l.size()-1);
                else
                    return false;
            }
        }
        
        while(list.size()>0){
            if(l.size()>0&&list.get(list.size()-1).index<l.get(l.size()-1).index){
                list.remove(list.size()-1);
                l.remove(l.size()-1);
            }
            else
                return false;
                
        }
        return true;
    }
}

class T{
    public char a;
    public int index;
    public T(char a,int index){
        this.a=a;
        this.index=index;
    }
}