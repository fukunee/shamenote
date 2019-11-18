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

    public int sts(String s1, String s2){
//        int len1 = s1.length(), len2 = s2.length();
//        int min = Math.min(len1,len2);
//        for(int i = 0; i < min; i++){
//            if(s1.charAt(i) > s2.charAt(i)) return 1;
//            else if(s1.charAt(i) < s2.charAt(i)) return -1;
//            else continue;
//        }
//
//        if(len1 == len2) return 0;
        return (s1+s2).compareTo(s2+s1);
    }

    public static void main(String[] args) {
        System.out.println(new lc_179().sts("34","3"));
    }
}
