package solution2;

/**
 * @author lwc
 * @date 2019/11/12 10:30
 */
public class U152 {
    public int maxProduct(int[] nums) {
        int maxTotal = Integer.MIN_VALUE;//计算最大乘积
        int maxSoFar = 0; //记录到0之前从start开始出现过的最大乘积
        int totalPre = 1; //记录每次到0之前第一次出现负数(包括)之前的所有数的乘积
        int soFar = 1; //记录到0之前所有数的乘积之和
        int start = 0; //记录0开始的下一个数位置

        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            if(value == 0){
                soFar = 1;
                totalPre = 1;
                start = i + 1;
                maxTotal = Math.max(maxTotal,0);
            }
            else {
                if (totalPre > 0) totalPre *= value;
                soFar *= value;
                if (soFar > 0 || i == start) maxSoFar = soFar;

                if (i + 1 == nums.length || nums[i + 1] == 0) {
                    if (soFar > 0 || i == start)
                        maxTotal = Math.max(soFar, maxTotal);
                    else
                        maxTotal = Math.max(Math.max(soFar / totalPre, maxSoFar), maxTotal);
                }
            }
        }
        return maxTotal;
    }

    public int maxProduct2(int[] nums) {
        int totalMax = Integer.MIN_VALUE;
        int min = 1;
        int max = 1;
        for(int i = 0; i < nums.length; i++){
            int value = nums[i];
            if(value < 0){
                max = max ^ min;
                min = max ^ min;
                max = max ^ min;
            }

            max = Math.max(max * value,value);
            min = Math.min(min * value,value);
            if(max > totalMax) totalMax = max;
        }
        return totalMax;
    }
}
