package solution2;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/11/10 23:36
 */
public class U167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] v = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                v[0] = map.get(target-numbers[i]);
                v[1] = i+1;
                return v;
            }
            map.put(numbers[i],i+1);
        }
        return v;
    }
}
