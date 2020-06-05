package leetcode;

/**
 * @author lwc
 * @date 2020/3/15 20:39
 */
public class lc_466 {
    public String validIPAddress(String IP) {
        if(IP == null || IP.isEmpty() || !Character.isLetterOrDigit(IP.charAt(IP.length() - 1)))
            return "Neither";
        if(IP.contains(".")){
            String[] strs = IP.split("\\.");
            if(strs.length != 4) return "Neither";
            for(String str : strs){
                if(str.length() < 1 || (str.charAt(0) == '0' && str.length() > 1) || !Character.isDigit(str.charAt(0)))
                    return "Neither";
                try{
                    if(Integer.valueOf(str) > 255) return "Neither";
                }catch (Exception e){
                    return "Neither";
                }
            }
            return "IPv4";
        }
        else{
            String[] strs = IP.split(":");
            if(strs.length != 8) return "Neither";
            for(String str : strs){
                if(str.length() > 4 || str.length() < 1 || str.charAt(0) == '-') return "Neither";
                for(char ch : str.toCharArray()){
                    if(Character.toLowerCase(ch) - 'a' > 5) return "Neither";
                }
            }
            return "IPv6";
        }
    }
}
