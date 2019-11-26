package solution2;

public class U27 {

    public int removeElement(int[] nums,int val){
        if(nums.length < 1) return 0;

        int offset = 0;
        for(int i = 0;i < nums.length; i++ ){
            if(nums[i]!=val) nums[offset++] = nums[i];
        }

        return offset;
    }
}
