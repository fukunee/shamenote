package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/29 14:09
 */
public class U117 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rs = new ArrayList<>();
        if(numRows == 0) return rs;
        rs.add(Arrays.asList(1));

        for(int i = 1; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> tempList = rs.get(i-1);
            list.add(tempList.get(0));
            for(int j = 0; j < tempList.size()-1; j++){
                list.add(tempList.get(j)+tempList.get(j+1));
            }
            list.add(tempList.get(tempList.size()-1));
            rs.add(list);
        }

        return rs;
    }
}
