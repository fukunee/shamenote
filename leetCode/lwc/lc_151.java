package solution2;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @author lwc
 * @date 2019/11/10 23:46
 */
public class U151 {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuffer rs = new StringBuffer();
        for(int i = strings.length-1; i >= 0 ; i--){
            if(!strings[i].isEmpty()){
                rs.append(strings[i]);
                rs.append(" ");
            }
        }
        return rs.length() > 0 ? rs.substring(0,rs.length()-1) : "";
    }
}
