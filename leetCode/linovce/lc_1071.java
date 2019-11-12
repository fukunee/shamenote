class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String A="";
        String B="";
        if(str1.length()==str2.length()&&str1.equals(str2))
            return str1;
        else if(str1.length()==str2.length()&&!str1.equals(str2))
            return "";
        if(str1.length()>str2.length()){
            A=str1;
            B=str2;
        }else{
            B=str1;
            A=str2;
        }
        while(!B.equals("")){
            if(A.startsWith(B)){
                A = A.replace(B,"");
            }else
                return "";

            if(A.length()==B.length()&&A.equals(B))
                return str1;
            else if(A.length()==B.length()&&!A.equals(B))
                return "";
            if(A.length()<B.length()){
                String t = A;
                A=B;
                B=t;
            }
        }
        return A;
        
    }
    
}