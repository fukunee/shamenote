package solution2;

public class U26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;

        int offset = 0;
        for(int i = 1;i < nums.length; i++){
            if(nums[i]==nums[i-1])
                continue;
            else
                nums[++offset]=nums[i];
        }
        return offset+1;
    }
}
