package solution2;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class U78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(rs,new ArrayList<>(),nums,0);
        return rs;
    }


    public void backtrack(List<List<Integer>> rs,List<Integer> tempList,int[] nums,int start){
        rs.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(rs,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }

}
