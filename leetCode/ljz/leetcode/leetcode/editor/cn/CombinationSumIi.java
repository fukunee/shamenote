//给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
// candidates 中的每个数字在每个组合中只能使用一次。 
//
// 说明： 
//
// 
// 所有数字（包括目标数）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1: 
//
// 输入: candidates = [10,1,2,7,6,1,5], target = 8,
//所求解集为:
//[
//  [1, 7],
//  [1, 2, 5],
//  [2, 6],
//  [1, 1, 6]
//]
// 
//
// 示例 2: 
//
// 输入: candidates = [2,5,2,1,2], target = 5,
//所求解集为:
//[
//  [1,2,2],
//  [5]
//] 
// Related Topics 数组 回溯算法

package cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CombinationSumIi {
    public static void main(String[] args) {

        Solution solution = new CombinationSumIi().new Solution();
        int[] a = {2,5,2,1,2};
        int target = 5;
        solution.combinationSum2(a, target);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> ret = new ArrayList<>();

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<Integer> list = new ArrayList<>();
            getres(list, 0, candidates, 0, target, 0);
            return ret;
        }

        public void getres(List<Integer> list, int sum, int[] candidates, int begin, int max, int i) {
            if (sum == max) {
                //Collections.sort(list);
                if(!ret.contains(list))
                    System.out.println(list);
                if(!ret.contains(list))
                    ret.add(new ArrayList<>(list));

                return;
            }
            int index = 0;
            for (; i < candidates.length && candidates[i] <= max;) {
                if (sum + candidates[i] <= max) {
                    list.add(candidates[i]);
                    sum += candidates[i];
                    i++;
                    //while(i+1 < candidates.length && candidates[i+1] == candidates[i]) i++;
                    getres(list, sum, candidates, begin, max, i);
                    sum-=list.get(list.size()-1);
                    list.remove(list.size()-1);

                } else {
                   break;
                }
            }


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}