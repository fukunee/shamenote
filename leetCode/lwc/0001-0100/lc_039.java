package solution2;

import java.util.*;

public class U39 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> rs = new ArrayList<>();
        backtrack(rs,new ArrayList<Integer>(),target,candidates,0);
        return rs;
    }


    public List<List<Integer>> combination(int[] candidates, int target){
        List<List<Integer>> rs = new ArrayList<>();

        for(int i = 0;i < candidates.length; i++){
            int remain = target-candidates[i];
            if(remain < 0) break;
            else if(remain == 0)
            {
                rs.add(Arrays.asList(target));
                break;
            }
            else{
                List<List<Integer>> temp = combination(candidates,remain);
                for(List list : temp){
                    List l = new ArrayList(list);
                    l.add(candidates[i]);
                    Collections.sort(l);
                    if(!rs.contains(l)) rs.add(l);
                }
                temp.clear();
            }
        }
        return rs;
    }


    public void backtrack(List<List<Integer>> rs, List<Integer> tempList,int remain, int[] nums, int start) {

        if(remain < 0) return;
        else if(remain == 0) rs.add(new ArrayList<>(tempList));
        else{
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backtrack(rs, tempList, remain-nums[i], nums, i);
                tempList.remove(tempList.size()-1);
            }
        }
    }


}
