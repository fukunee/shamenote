 //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针
  
  package cn;
  public class MoveZeroes{
      public static void main(String[] args) {
           Solution solution = new MoveZeroes().new Solution();
           int[] nums = {1,0,1};
           solution.moveZeroes(nums);
           for(Integer i : nums)
               System.out.println(i);
      }
      

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1) return;
        int a = 0, b = 0, c = 0;
        while(a < n && nums[a] != 0) a++;
        b = a+1;
        if(b >= n) return;
        if(a != 0) c = a;
        while(b < n){
            while(b < n && nums[b] != 0) b++;
            for(a++; a < b; a++)
                nums[c++] = nums[a];
            b++;
        }
        if(c == 0) return;
        for(; c < n;)
            nums[c++] = 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }