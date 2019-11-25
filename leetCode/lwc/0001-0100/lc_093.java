package solution2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/22 17:56
 */
public class U93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> rs = new ArrayList<>();
        recursive(rs,3,"",s);
        return rs;
    }

    public void recursive(List rs,int pot,String tempStr,String s){
        if(s.isEmpty()) return;
        if(pot == 0) {
            if(s.length() == 1 || s.length() > 1 && s.length() < 3 && s.charAt(0) != '0' && Integer.valueOf(s) <= 255)
                rs.add(tempStr+s);
        }
        else{
            for (int i = 1; i <= 3 && s.length() >= i; i++) {
                String newStr = s.substring(0, i);
                if (i == 1 || i > 1 && newStr.charAt(0) != '0' && Integer.valueOf(newStr) <= 255)
                    recursive(rs, pot - 1, tempStr + newStr + ".", s.substring(i));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new U93().restoreIpAddresses("0000"));
    }

}
