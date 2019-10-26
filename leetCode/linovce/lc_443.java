class Solution {
    public int compress(char[] chars) {
        int n=0,j=0;
        char t=' ';
        
        for(int i=0;i<chars.length;){
            if(n==0){
                chars[j]=chars[i];
                n++;
                j++;
                t=chars[i];
                i++;
            }else{
                if(chars[i]==t){
                    n++;
                    i++;
                }else{
                    if(n==1){
                        n=0;
                        continue;
                    }
                        
                    char[] tmp = String.valueOf(n).toCharArray();
                    for(int k=0;k<tmp.length;k++){
                        chars[j]=tmp[k];
                        j++;
                    }
                    n=0;
                    
                }
            }
        }
        if(n==1)
            return j;
        char[] tmp = String.valueOf(n).toCharArray();
        for(int k=0;k<tmp.length;k++){
            chars[j]=tmp[k];
            j++;
        }
        return j;
    }
}