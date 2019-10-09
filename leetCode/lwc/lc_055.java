package solution2;

/**
 * @author lwc
 * @date 2019/10/9 16:44
 */
public class U55 {
    public boolean canJump(int[] nums) {
        int length = nums.length;
        int[] visit = new int[length];
        visit[length-1] = 1;
        int pos = length-1;
        for(int i = length-2; i >=0; i--){
            if(i+nums[i] >= pos)
            {
                visit[i] = 1;
                pos = i;
            }
        }
        return visit[0]==1;
    }

    public static void main(String[] args) {
        System.out.println(new U55().canJump(new int[]{3,2,1,0,4}));
    }
}
