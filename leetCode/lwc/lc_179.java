package leetcode;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author lwc
 * @date 2019/11/16 16:59
 */
public class lc_179 {
    public String largestNumber(int[] nums) {
        String rs = Arrays.stream(nums).boxed().map(i -> i.toString())
        .sorted((o1, o2) -> (o2+o1).compareTo(o1+o2)).collect(Collectors.joining(""));
        return rs.charAt(0) == '0' ? "0" : rs;
    }
}
