package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lwc
 * @date 2019/10/20 21:59
 */
public class U90 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(rs,new ArrayList(),nums,0);
        return rs;
    }

    public void backtrack(List<List<Integer>> rs, List tempList, int[] nums, int start){
        rs.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(rs,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
            while(i + 1 < nums.length && nums[i+1] == nums[i]) i++;
        }
    }

}
