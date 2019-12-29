package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author lwc
 * @date 2019/12/24 9:41
 */
public class lc_412 {
    public List<String> fizzBuzz(int n) {
        List<String> rs = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String res = "";
            if(i % 3 == 0)
                res += "Fizz";
            if(i % 5 == 0)
                res += "Buzz";
            if(res.equals(""))
                res += i;
            rs.add(res);
        }
        return rs;
    }
}
