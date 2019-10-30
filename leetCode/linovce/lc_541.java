class Solution {
    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int i=0,j=k;
        
        while(j<=c.length){
            convert(c,i,j-1);
            i=j+k;
            j=i+k;
        }
        
        if(i<c.length){
            convert(c,i,c.length-1);
        }
        
        return String.valueOf(c);
    }
    
    public void convert(char[] c,int l,int f){
        int i=l,j=f;
        
        while(i<j){
            char t = c[i];
            c[i]=c[j];
            c[j]=t;
            i++;
            j--;
        }
    }
    
    
}