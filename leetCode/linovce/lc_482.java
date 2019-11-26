class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String s = S.toUpperCase();
        String[] str = s.split("-");
        s="";
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
            s=s+str[i];
        }
        System.out.println(s);
        String r="";
        int k=K;
        for(int i=s.length()-1;i>=0;i--){
            if(k!=0){
                r=s.charAt(i)+r;
                k--;
            }else{
                i++;
                r="-"+r;
                k=K;
            }
        }
        return r;
    }
}