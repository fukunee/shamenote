package leetcode;

import java.util.*;

/**
 * @author lwc
 * @date 2019/12/22 17:31
 */
public class lc_406 {
    public int[][] reconstructQueue(int[][] people) {
        //Arrays.sort(people, (v1,v2)->v1[1]-v2[1]);
        List<int[]> rs = new ArrayList<>();
        for(int[] p : people){
            int h = p[0], k = p[1];
            int count = 0, pos = -1, j = 0;
            for(j = 0; j < rs.size(); j++) {
                if(rs.get(j)[0] >= h) count++;
                if(count == k) pos = j + 1;
                if(count > k) break;
            }
            if(pos == -1) pos = j;
            rs.add(pos, p);
        }
        return rs.toArray(new int[0][0]);
    }

    /**
     * 解题思路：先排序再插入
     * 1.排序规则：按照先H高度降序，K个数升序排序
     * 2.遍历排序后的数组，根据K插入到K的位置上
     *
     * 核心思想：高个子先站好位，矮个子插入到K位置上，前面肯定有K个高个子，矮个子再插到前面也满足K的要求
     *
     * @param people
     * @return
     */
    public int[][] reconstructQueue2(int[][] people) {
        // [7,0], [7,1], [6,1], [5,0], [5,2], [4,4]
        // 再一个一个插入。
        // [7,0]
        // [7,0], [7,1]
        // [7,0], [6,1], [7,1]
        // [5,0], [7,0], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [7,1]
        // [5,0], [7,0], [5,2], [6,1], [4,4], [7,1]
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);

        List<int[]> list = new ArrayList<>();
        for (int[] i : people) {
            list.add(i[1], i);
        }

        return list.toArray(new int[list.size()][2]);
    }
}
