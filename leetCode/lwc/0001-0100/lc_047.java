package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class U47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        if(nums.length <= 1)
            rs.add(new ArrayList<>(Arrays.asList(nums[0])));
        else{
            int target = nums[nums.length-1];
            List<List<Integer>> temp = permuteUnique(Arrays.copyOfRange(nums,0,nums.length-1));
            while(!temp.isEmpty()){
                List<List<Integer>> k = new ArrayList<>();
                permuteAdd(k,temp.remove(0),target);
                rs.addAll(k);
            }
        }

        HashSet<List<Integer>> set = new HashSet<>(rs);
        rs.clear();
        rs.addAll(set);

        return rs;
    }

    public void permuteAdd(List<List<Integer>> k,List<Integer> list,int target){
        int pos = 0;
        while(pos <= list.size()){
            List<Integer> u = new ArrayList<>(list);
            u.add(pos, target);
            k.add(u);
            pos = pos + 1;
        }
    }
}
