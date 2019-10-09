class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<String>();
        
        for(int i=0;i<emails.length;i++){
            String s="";
            String[] str1 = emails[i].split("@");            
            String[] str2 = str1[0].split("\\+");
            String[] str3 = str2[0].split("\\.");
            for(int j=0;j<str3.length;j++){
                s+=str3[j];
            }
            s+="@";
            s+=str1[1];
            
            set.add(s);
        }
        
        return set.size();
    }
}