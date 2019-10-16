class Solution {
    public String validIPAddress(String IP) {
        if(IP.length()<=3||IP.charAt(0)=='.'||IP.charAt(0)==':'||IP.charAt(IP.length()-1)=='.'||IP.charAt(IP.length()-1)==':')
            return "Neither";
        if(IP.split("\\.").length==4){
            String str[] = IP.split("\\.");
            
            for(int i=0;i<str.length;i++){
                
                if(str[i].length()<1||str[i].length()!=1&&str[i].charAt(0)=='0'||str[i].length()>3)
                    return "Neither";
                
                if(str[i].length()==1&&str[i].charAt(0)>='0'&&str[i].charAt(0)<='9')
                    continue;
                
                else if(str[i].length()==2&&str[i].charAt(0)>='1'&&str[i].charAt(0)<='9'&&str[i].charAt(1)>='0'&&str[i].charAt(1)<='9')
                    continue;
                
                else if(str[i].length()==3&&str[i].charAt(0)=='1'&&str[i].charAt(1)<='9'&&str[i].charAt(1)>='0'&&str[i].charAt(2)<='9'&&str[i].charAt(2)>='0')
                    continue;
                
                else if(str[i].length()==3&&str[i].charAt(0)=='2'&&str[i].charAt(1)<='9'&&str[i].charAt(1)>='0'&&str[i].charAt(2)<='5'&&str[i].charAt(2)>='0')
                    continue;
                else
                    return "Neither";
                
            }
            return "IPv4";
        }
        else if(IP.split(":").length==8){
            String str[] = IP.split(":");
            
            for(int i=0;i<8;i++){
                if(str[i].length()<1||str[i].length()>4)
                    return "Neither";
                
                for(int j=0;j<str[i].length();j++){
                    if(str[i].charAt(j)>='0'&&str[i].charAt(j)<='9'||str[i].charAt(j)>='a'&&str[i].charAt(j)<='f'||str[i].charAt(j)>='A'&&str[i].charAt(j)<='F')
                        continue;
                    else
                        return "Neither";
                }
            }
            return "IPv6";
        }
        
        return "Neither";
    }
}