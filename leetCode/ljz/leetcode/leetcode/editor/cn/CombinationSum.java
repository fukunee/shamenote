//给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
// candidates 中的数字可以无限制重复被选取。 
//
// 说明： 
//
// 
// 所有数字（包括 target）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1: 
//
// 输入: candidates = [2,3,6,7], target = 7,
//所求解集为:
//[
//  [7],
//  [2,2,3]
//]
// 
//
// 示例 2: 
//
// 输入: candidates = [2,3,5], target = 8,
//所求解集为:
//[
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
//] 
// Related Topics 数组 回溯算法

package cn;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {

        Solution solution = new CombinationSum().new Solution();
        int[] a = {2, 3, 6, 7};
        int target = 7;
        solution.combinationSum(a, target);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 这道题主流解法是使用回溯法，我用的动态规划，时间复杂度相对还更高
         * 时间14%，主要是这道题的衍生题，后面必须要用dp，之后提交一个回溯的版本
         * @param candidates
         * @param target
         * @return
         */
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            int i = 1, j = 0;
            Arrays.sort(candidates);
            Map<Integer, Set<List<Integer>>> map = new HashMap<>();
            for (; i < target + 1; i++) {
                Set<List<Integer>> set = new HashSet<>();
                for (j = 0; j < candidates.length && candidates[j] <= i; j++) {
                    List<Integer> list = new ArrayList<>();
                    if (i == candidates[j]) {
                        list.add(i);
                        set.add(list);
                    } else if (i > candidates[j]) {
                        int subi = i - candidates[j];
                        Iterator<List<Integer>> it = map.get(subi).iterator();
                        while (it.hasNext()) {
                            List<Integer> temp = it.next();
                            List<Integer> temp1 = new ArrayList<>(temp);
                            //System.out.println("i="+i+" j="+j+" temp="+temp1);
                            temp1.add(candidates[j]);
                            Collections.sort(temp1);
                            set.add(temp1);

                        }
                    }
                }
                map.put(i, set);
//                for(int k = 1; k <= i; k++){
//                    System.out.println("i="+k+" "+map.get(k));
//                }
            }

//            Iterator<List<Integer>> it = map.get(target).iterator();
            List<List<Integer>> ret = new ArrayList<>();
//            while (it.hasNext()) {
//                List<Integer> addlist = it.next();
//                ret.add(addlist);
//                //System.out.println(addlist);
//            }
            ret.addAll(map.get(target));
            return ret;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}