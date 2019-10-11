import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class lc_406 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int[][] reconstructQueue(int[][] people) {
            if(people.length==0||people[0].length==0) return new int[0][0];
            Arrays.sort(people, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    int result=o2[0]-o1[0];
                    if(result==0)
                    {
                        result=o1[1]-o2[1];
                    }
                    return result;
                }
            });
            List <int []> list=new ArrayList<>();
            for(int a[]:people)
            {
                list.add(a);
            }
            int temp[]=new int[2];
            for(int i=0;i<people.length;i++)
            {
                temp=list.get(i);
                list.remove(i);
                list.add(temp[1],temp);
            }
            return list.toArray(new int[list.size()][]);
        }
    }
}
