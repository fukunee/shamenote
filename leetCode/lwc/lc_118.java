package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/29 14:17
 */
public class U118 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> rs = new ArrayList<>();
        rs.add(Arrays.asList(1));

        for(int i = 1; i <= rowIndex; i++){
            List<Integer> list = new ArrayList<>();
            List<Integer> tempList = rs.get(i-1);
            list.add(tempList.get(0));
            for(int j = 0; j < tempList.size()-1; j++){
                list.add(tempList.get(j)+tempList.get(j+1));
            }
            list.add(tempList.get(tempList.size()-1));
            rs.add(list);
        }

        return rs.get(rowIndex);
    }

    public List<Integer> getRow2(int rowIndex) {
        List<Integer> rs = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            rs.add(0,1);
            for(int j = 1; j < i ; j++){
                rs.set(j,rs.get(j)+rs.get(j+1));
            }
        }
        return rs;
    }
}
