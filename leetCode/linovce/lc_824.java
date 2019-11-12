class Solution {
    public String toGoatLatin(String S) {
        String[] str = S.split(" ");
        
        for(int i=0;i<str.length;i++){
            if(str[i].charAt(0)=='a'||str[i].charAt(0)=='A'||str[i].charAt(0)=='e'||str[i].charAt(0)=='E'||str[i].charAt(0)=='i'||str[i].charAt(0)=='I'||str[i].charAt(0)=='o'||str[i].charAt(0)=='U'||str[i].charAt(0)=='O'||str[i].charAt(0)=='u')
                str[i]=str[i]+"ma";
            else{
                str[i]=str[i]+str[i].charAt(0)+"ma";
                str[i]=str[i].substring(1);
            }
            for(int j=0;j<i+1;j++){
                str[i]=str[i]+"a";
            }
        }
        String r="";
        for(int i=0;i<str.length;i++){
            r=r+str[i];
            if(i!=str.length-1)
                r = r+" ";
        }
        
        return r;
    }
}