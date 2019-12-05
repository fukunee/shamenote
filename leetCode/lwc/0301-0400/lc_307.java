package leetcode;

/**
 * @author lwc
 * @date 2019/11/28 14:38
 */
public class lc_307 {
    class NumArray {

        int[] tree;
        int n;

        private void buildTree(int[] nums, int[] tree){
            for(int i = 0, j = n + 1; i < n; i++,j++){
                tree[j] = nums[i];
            }
            for(int j = n; j >= 0; j--){
                tree[j] = tree[j*2+1] + tree[j*2+2];
            }
        }

        public NumArray(int[] nums) {
            n = nums.length;
            tree = new int[n * 2 + 3];
            buildTree(nums,tree);
        }

        public void update(int i, int val) {
            i = i + n + 1;
            int change = val - tree[i];
            tree[i] = val;
            while(i > 0){
                i = i % 2 == 0 ? i / 2 - 1 : i / 2;
                tree[i] += change;
            }
        }

        public int sumRange(int i, int j) {
            i = i + n + 1;
            j = j + n + 1;
            int sum = 0;
            while(i <= j){
                if(i % 2 == 0){
                    sum += tree[i];
                    i ++;
                }
                if(j % 2 == 1){
                    sum += tree[j];
                    j --;
                }
                i = i / 2;
                j = j / 2 - 1;
            }
            return sum;
        }
    }
}
