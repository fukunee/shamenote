//有 N 个花园，按从 1 到 N 标记。在每个花园中，你打算种下四种花之一。
//
// paths[i] = [x, y] 描述了花园 x 到花园 y 的双向路径。 
//
// 另外，没有花园有 3 条以上的路径可以进入或者离开。 
//
// 你需要为每个花园选择一种花，使得通过路径相连的任何两个花园中的花的种类互不相同。 
//
// 以数组形式返回选择的方案作为答案 answer，其中 answer[i] 为在第 (i+1) 个花园中种植的花的种类。花的种类用 1, 2, 3, 4 表示。保证存在答案。 
//
// 
//
// 示例 1： 
//
// 输入：N = 3, paths = [[1,2],[2,3],[3,1]]
//输出：[1,2,3]
// 
//
// 示例 2： 
//
// 输入：N = 4, paths = [[1,2],[3,4]]
//输出：[1,2,1,2]
// 
//
// 示例 3： 
//
// 输入：N = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
//输出：[1,2,3,4]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= N <= 10000 
// 0 <= paths.size <= 20000 
// 不存在花园有 4 条或者更多路径可以进入或离开。 
// 保证存在答案。 
// 
// Related Topics 图

package cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FlowerPlantingWithNoAdjacent {
    public static void main(String[] args) {

        Solution solution = new FlowerPlantingWithNoAdjacent().new Solution();
        int[][] paths = {{1, 2}, {2, 3}, {3, 1}};
        solution.gardenNoAdj(3, paths);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] gardenNoAdj(int N, int[][] paths) {
            /**
             * 89%...
             */

            int ret[] = new int[N];
            List<Integer>[] a = new List[N + 1];
            int i = 0, j = 0, flag = 0;
            ret[0] = 1;
            if (paths.length == 0) {
                for (; i < N; i++)
                    ret[i] = 1;
                return ret;
            }
            for (i = 0; i < paths.length; i++) {
                if (a[paths[i][0] - 1] == null)
                    a[paths[i][0] - 1] = new ArrayList<>();
                a[paths[i][0] - 1].add(paths[i][1] - 1);

                if (a[paths[i][1] - 1] == null)
                    a[paths[i][1] - 1] = new ArrayList<>();
                a[paths[i][1] - 1].add(paths[i][0] - 1);
            }
            int k = 0;
            for (i = 0; i < N; i++) {
                for(k = 1; k < 5; k++){
                    flag = 0;
                    for (j = 0; a[i] != null && j < a[i].size(); j++) {
                        if(k == ret[a[i].get(j)]) {
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 0){
                        ret[i] = k;
                        break;
                    }
                }
            }
            for (Integer num : ret)
                System.out.print(" " + num);
            return ret;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}