//有 N 个房间，开始时你位于 0 号房间。每个房间有不同的号码：0，1，2，...，N-1，并且房间里可能有一些钥匙能使你进入下一个房间。
//
// 在形式上，对于每个房间 i 都有一个钥匙列表 rooms[i]，每个钥匙 rooms[i][j] 由 [0,1，...，N-1] 中的一个整数表示，其中 N = rooms.length。 钥匙 rooms[i][j] = v 可以打开编号为 v 的房间。 
//
// 最初，除 0 号房间外的其余所有房间都被锁住。 
//
// 你可以自由地在房间之间来回走动。 
//
// 如果能进入每个房间返回 true，否则返回 false。 
//
// 
// 
//
// 示例 1： 
//
// 输入: [[1],[2],[3],[]]
//输出: true
//解释:  
//我们从 0 号房间开始，拿到钥匙 1。
//之后我们去 1 号房间，拿到钥匙 2。
//然后我们去 2 号房间，拿到钥匙 3。
//最后我们去了 3 号房间。
//由于我们能够进入每个房间，我们返回 true。
// 
//
// 示例 2： 
//
// 输入：[[1,3],[3,0,1],[2],[0]]
//输出：false
//解释：我们不能进入 2 号房间。
// 
//
// 提示： 
//
// 
// 1 <= rooms.length <= 1000 
// 0 <= rooms[i].length <= 1000 
// 所有房间中的钥匙数量总计不超过 3000。 
// 
// Related Topics 深度优先搜索 图

package cn;

import java.util.*;

public class KeysAndRooms {
    public static void main(String[] args) {

        Solution solution = new KeysAndRooms().new Solution();
        List<List<Integer>> result = new LinkedList<>();

        result.add(new LinkedList<>(Arrays.asList(1,3)));
        result.add(new LinkedList<>(Arrays.asList(1,4)));
        result.add(new LinkedList<>(Arrays.asList(2,3,2,4,1)));
        result.add(new LinkedList<>(Arrays.asList()));
        result.add(new LinkedList<>(Arrays.asList(4,3,2)));
        if (solution.canVisitAllRooms(result)) System.out.print("1");
        else System.out.print("2");
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            /**
             * 超过60%，使用list判断太多，尝试使用set
             */
            /*int n = rooms.size(), i = 0, j = 0;
            List<Integer> temp = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            list.add(0);
            for(j = 0; j < rooms.get(0).size(); j++){
                if(!list.contains(rooms.get(0).get(j)))
                    list.add(rooms.get(0).get(j));
            }
            while(i < list.size()){
                temp = rooms.get(list.get(i));
                for(j = 0; j < temp.size(); j++){
                    if(!list.contains(temp.get(j)))
                        list.add(temp.get(j));
                }
                i++;
            }
            return (n == list.size());*/
            /**
             * 改进后100
             */
            int n = rooms.size(), i = 0, j = 0, k = 0;
            List<Integer> temp;
            List<Integer> list = new ArrayList<>();
            int[] a = new int[n];
            list.add(0);
            a[0] = 1;
            for(j = 0; j < rooms.get(0).size(); j++){
                i = rooms.get(0).get(j);
                if(a[i] == 0){
                    list.add(i);
                    a[i] = 1;
                }
            }
            i = 0;
            while(i < list.size()){
                temp = rooms.get(list.get(i));
                for(j = 0; j < temp.size(); j++){
                    k = temp.get(j);
                    if(a[k] == 0){
                        list.add(k);
                        a[k] = 1;
                    }
                }
                i++;
            }
            return (n == list.size());
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}