package solution2;

public class U14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length == 0) return "";
        String rs = strs[0];
        for(int i = 0;i < strs.length; i++){
            rs = getMaxPrefix(rs,strs[i]);
            if(rs=="") break;
        }
        return rs;
    }

    public String getMaxPrefix(String rs,String str){
        if(rs.isEmpty() || str.isEmpty()) return "";
        int index = 0;
        while(index < rs.length() && index < str.length()){
            if(rs.charAt(index) == str.charAt(index))
                index ++;
            else
                break;
        }
        return rs.substring(0,index);
    }

}
