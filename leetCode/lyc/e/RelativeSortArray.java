package easy;
/*lc_1122*/
import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArray {
    public static void main(String[] args){
        Solution solution = new RelativeSortArray().new Solution();
        int[] arr1 = new int[]{2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[]{2,1,4,3,9,6};
        System.out.print(solution.relativeSortArray(arr1,arr2));
    }
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            HashMap<Integer,Integer> map = new HashMap<>();
            Arrays.sort(arr1);
            for(int num : arr1){
                if(map.containsKey(num)){
                    map.put(num,map.get(num) + 1);
                }
                else{
                    map.put(num,1);
                }
            }
            int i = 0;
            int[] res = new int[arr1.length];
            for(int num : arr2){
                int temp = map.get(num);
                while(temp > 0){
                    res[i++] = num;
                    temp --;
                }
                map.put(num,0);
            }
            for(int num : arr1){
                if(map.get(num) > 0){
                    int temp = map.get(num);
                    while(temp > 0){
                        res[i++] = num;
                        temp --;
                    }
                    map.put(num,0);
                }
            }
            return res;
        }
    }
}
