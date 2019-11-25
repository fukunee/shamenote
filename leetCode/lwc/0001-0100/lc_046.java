package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        if(nums.length <= 1)
            rs.add(new ArrayList<>(Arrays.asList(nums[0])));
        else{
            int target = nums[nums.length-1];
            List<List<Integer>> temp = permute(Arrays.copyOfRange(nums,0,nums.length-1));
            while(!temp.isEmpty()){
                List<List<Integer>> k = new ArrayList<>();
                permuteAdd(k,temp.remove(0),target);
                rs.addAll(k);
            }
        }

        return rs;
    }

    public void permuteAdd(List<List<Integer>> k,List<Integer> list,int target){
        int pos = 0;
        while(pos <= list.size()){
            List<Integer> u = new ArrayList<>(list);
            u.add(pos,target);
            k.add(u);
            pos = pos + 1;
        }
    }


    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
