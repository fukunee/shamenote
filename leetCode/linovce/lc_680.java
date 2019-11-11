class Solution {
    public boolean validPalindrome(String s) {
        int index1=-1,index2=-1;
        
        int f=0;
        
        int i=0,j=s.length()-1;
        
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                if(f==0){
                    index1=i;
                    index2=j;
                    i++;
                    f++;
                }else if(f==1){
                    i=index1;
                    j=index2-1;
                    f++;
                }else
                    return false;
                    
            }else{
                i++;
                j--;
            }
            
        }
        
        return true;
    }
}