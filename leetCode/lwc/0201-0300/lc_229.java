package leetcode;

import javafx.util.Pair;
import sun.util.resources.cldr.zh.CalendarData_zh_Hans_HK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author lwc
 * @date 2019/11/23 23:58
 */
public class lc_229 {

    //false
    public List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        List<Integer> rs = new ArrayList<>();
        int key1 = 0, key2 = 0, value1 = 0, value2 = 0;
        for(int num : nums){
           if(key1 == num) value1 ++;
           else if(key2 == num) value2 ++;
           else{
               if(value1 == 0) {
                   key1 = num;
                   value1 ++;
               }
               else if(value2 == 0)
               {
                   key2 = num;
                   value2 ++;
               }
               else{
                   value1 --;
                   value2 --;
               }
           }
        }
        if(value1 != 0 || value2 != 0){
            if(value1 > value2) rs.add(key1);
            else if(value1 < value2) rs.add(key2);
            else{
                rs.add(key1);
                rs.add(key2);
            }
        }
        return rs;
    }


    public List<Integer> majorityElement2(int[] nums) {
        int count = 0;
        int len = nums.length;
        List<Integer> rs = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            Integer value = map.get(num);
            if(value == null) value = 0;
            map.put(num,++value);

            if(value > len / 3 && count == 0){
                rs.add(num);
                count = 1;
            }
            else if(value > len /3 && count != 0 && rs.get(0) != num){
                rs.add(num);
                break;
            }
        }
        return rs;
    }
}
