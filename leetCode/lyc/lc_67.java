class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res= new StringBuilder();
        int lena=a.length()-1;
        int lenb=b.length()-1;
        int tag=0;
        while(lena>=0||lenb>=0){
            int sum=tag;
            if(lena>=0){
                sum+=(a.charAt(lena) - '0');
                lena--;
            }
            if(lenb>=0){
                sum+=(b.charAt(lenb)-'0');
                lenb--;
            }
            res.append(sum%2);
            tag=sum/2;
        }
        if(tag!=0){
            res.append(tag);
        }
        return res.reverse().toString();
    }
}