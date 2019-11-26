package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/20 19:28
 */
public class U89 {
    public List<Integer> grayCode(int n) {
        if(n == 0) return Arrays.asList(0);
        if(n == 1) return new ArrayList<>(Arrays.asList(0,1));

        List<Integer> rs = grayCode(n-1);
        int pos = rs.size()-1;
        int increment = (int)Math.pow(2,n-1);
        while(pos >= 0){
            rs.add(rs.get(pos--) | increment);
        }
        return rs;
    }
}
