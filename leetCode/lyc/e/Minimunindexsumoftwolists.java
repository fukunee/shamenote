package easy;
/*lc_599*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Minimunindexsumoftwolists {
    public static void main(String[]args){
        Solution solution = new Minimunindexsumoftwolists().new Solution();
        String[] list1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = new String[]{"KFC", "Shogun", "Burger King"};
        System.out.print(solution.findRestaurant(list1,list2));
    }
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            HashMap<String,Integer> map = new HashMap<>();
            int k = 0;
            for (String str : list1){
                map.put(str,k++);
            }
            int index = Integer.MAX_VALUE;
            List<String> list = new ArrayList<>();
            for(int i = 0;i < list2.length;i++){
                if(map.containsKey(list2[i])){
                    int temp = map.get(list2[i]) + i;
                    if(temp < index){
                        list.clear();
                        index = temp;
                        list.add(list2[i]);
                    }else if(temp == index){
                        list.add(list2[i]);
                    }
                }

            }
            String[] res = new String[list.size()];
            return list.toArray(res);
        }
    }
}
