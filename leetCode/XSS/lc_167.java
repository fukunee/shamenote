public class lc_167 {
    public static void main(String[] args) {

    }
    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int i=0;int j=numbers.length-1;
            while (i<j)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    return new int[]{i,j};
                }
                else if(numbers[i]+numbers[j]>target)
                {
                    j--;
                }
                else if(numbers[i]+numbers[j]<target)
                {
                    i++;
                }
            }
            return new int[]{};
        }
    }
}
