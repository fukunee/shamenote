package solution2;

/**
 * @author lwc
 * @date 2019/11/3 21:10
 */
public class U134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, maxCur = 0, point = 0;
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            maxCur += gas[i] - cost[i];
            if(maxCur < 0) {
                maxCur = 0;
                point = i + 1;
            }
        }
        if(total < 0 || point == gas.length) return -1;
        return point;
    }
}
