//给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
//
// 说明：解集不能包含重复的子集。 
//
// 示例: 
//
// 输入: nums = [1,2,3]
//输出:
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//] 
// Related Topics 位运算 数组 回溯算法

package cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {

        Solution solution = new Subsets().new Solution();
        int[] a = {1, 2, 3};
        solution.subsets(a);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public List<List<Integer>> subsets(int[] nums) {
            /**
             * 10%,感觉从大方向上都有点不对，换一个方法，
             * 模拟自然生成
             */
            /*version1
            int n = nums.length, k = 1, i = 0;
            List<List<Integer>> ret = new ArrayList<>();
            List<List<Integer>> temp = new ArrayList<>();
            List<List<Integer>> temp1 = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            //Arrays.sort(nums);
            ret.add(list);
            for (; i < n; i++) {
                int num = nums[i];
                ret.add(new ArrayList<Integer>(){{add(num);}});
                temp.add(new ArrayList<Integer>(){{add(num);}});
            }
            while (k <= n) {
                if (k % 2 == 1) {
                    for (i = 0; i < n; i++) {
                        temp1.addAll(addset(temp, nums[i]));
                    }
                    ret.addAll(temp1);
                    temp.clear();
                } else {
                    for (i = 0; i < n; i++) {
                        temp.addAll(addset(temp1, nums[i]));
                    }
                    ret.addAll(temp);
                    temp1.clear();
                }
                k++;
            }
            return ret;
            version1
             */
            //version2 99% 看了看题解，有个用位运算的方法我佛了
            /*version2
            int i = 0, j = 0, n = nums.length, end = n+1, k = 1, m = 0;
            int max = 0, maxlen = 0;
            List<Integer> list = new ArrayList<>();
            List<List<Integer>> ret = new ArrayList<>();
            ret.add(list);
            for(; i < n; i++){
                int x = nums[i];
                ret.add(new ArrayList<Integer>(){{add(x);}});
            }
            i = 1;
            j = n+1;
            while(k <= n){
                while(i < end){
                    maxlen = ret.get(i).size()-1;
                    max = ret.get(i).get(maxlen);
                    for(m = 0; m < n; m++){
                        if(nums[m] <= max){
                            continue;
                        }
                        else{
                            List<Integer> addlist = new ArrayList<>(ret.get(i));
                            addlist.add(nums[m]);
                            ret.add(j,addlist);
                            j++;
                        }
                    }
                    i++;
                }
                end = j;
                k++;
            }
            return ret;
            version2
             */
            //version3 位运算 稳定99%
            List<List<Integer>> ret = new ArrayList<>();
            int i = 0, n = nums.length, j = 0;
            for(; i < (1<<n); i++){
                List<Integer> list = new ArrayList<>();
                for(j = 0; j < n; j++){
                    if(((i>>j) & 1) == 1)
                        list.add(nums[j]);
                }
                ret.add(list);
            }
            return ret;
        }

        /*version1
        public List<List<Integer>> addset(List<List<Integer>> a, int num) {
            List<List<Integer>> ret = new ArrayList<>();
            List<Integer> c;
            for (List<Integer> b : a) {
                c = new ArrayList<>(b);
                if (Collections.min(c) > num) {
                    c.add(num);
                    ret.add(new ArrayList<>(c));
                }
            }
            return ret;
        }
        version1
         */
    }
//leetcode submit region end(Prohibit modification and deletion)

}