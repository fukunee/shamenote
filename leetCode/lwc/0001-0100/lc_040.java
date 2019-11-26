package solution2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> rs = new ArrayList<>();
        backtrack(rs,new ArrayList<>(),target,candidates,0);
        return rs;
    }


    public void backtrack(List<List<Integer>> rs, List<Integer> tempList, int remain,int[] candidates, int start){
        if(remain < 0) return;
        else if(remain == 0) rs.add(new ArrayList<>(tempList));


        else{
            for(int i = start;i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i-1]) continue;
                tempList.add(candidates[i]);
                backtrack(rs,tempList,remain-candidates[i],candidates,i+1);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}
