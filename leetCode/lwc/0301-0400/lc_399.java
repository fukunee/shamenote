package leetcode;

import javafx.util.Pair;
import java.util.*;

/**
 * @author lwc
 * @date 2019/12/21 22:14
 */
public class lc_399 {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,List<Pair<String,Double>>> map = new HashMap<>();
        for(int i = 0; i < equations.size(); i++){
            String str1 = equations.get(i).get(0);
            String str2 = equations.get(i).get(1);
            if(!map.containsKey(str1))
                map.put(str1, new ArrayList<>());
            if(!map.containsKey(str2))
                map.put(str2, new ArrayList<>());
            map.get(str1).add(new Pair<>(str2, values[i]));
            map.get(str2).add(new Pair<>(str1, 1 / values[i]));
        }

        double[] v = new double[queries.size()];
        for(int i = 0; i < queries.size(); i++){
            String str1 = queries.get(i).get(0);
            String str2 = queries.get(i).get(1);
            if(!map.containsKey(str1) || !map.containsKey(str2)) {
                v[i] = -1;
            }
            else{
                if(str1.equals(str2)) v[i] = 1;
                else{
                    HashSet<String> set = new HashSet<>();
                    v[i] = help(map, str1, str2, set);
                }
            }
        }
        return v;
    }

    public double help(HashMap<String,List<Pair<String,Double>>> map, String str1, String str2, HashSet<String> set){
        if(str1.equals(str2)) return 1;
        if(set.contains(str1)) return 0;
        set.add(str1);
        for(Pair<String,Double> pair : map.get(str1)){
            if(set.contains(pair.getKey())) continue;
            double v = pair.getValue() * help(map, pair.getKey(), str2, set);
            if(v > 0) return v;
        }
        return -1;
    }
}
