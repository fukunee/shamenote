class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length())
            return false;
        if(A.length()==0)
            return true;
        int f=-1;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==B.charAt(0)){
                for(int j=i,k=0;k<B.length();k++){
                    if(A.charAt(j)==B.charAt(k)){
                        if(j==A.length()-1)
                            j=0;
                        else
                            j++;
                    }else{
                        f=0;
                        break;
                    }                        
                }

                if(f!=0)
                    return true;
                else
                    f=-1;
            }
        }
        return false;
    }
}