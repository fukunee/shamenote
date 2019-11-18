package solution2;

import java.util.HashMap;

/**
 * @author lwc
 * @date 2019/11/10 23:36
 */
public class U167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            if(numbers[left] + numbers[right] == target)
                return new int[]{left + 1, right + 1};
            else if(numbers[left] + numbers[right] > target)
                right --;
            else
                left ++;
        }
        return new int[]{0, 0};
    }
}
